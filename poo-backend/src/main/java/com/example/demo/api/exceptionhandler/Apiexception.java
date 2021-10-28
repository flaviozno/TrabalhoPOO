package com.example.demo.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.api.exceptionhandler.Problem.Campo;

@ControllerAdvice
public class Apiexception extends ResponseEntityExceptionHandler{
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, 
			HttpHeaders headers, HttpStatus status, WebRequest request){
		
		
		ArrayList<Campo> campo = new ArrayList<Problem.Campo>();
		
		for(ObjectError error: ex.getBindingResult().getAllErrors()) {
			String menssagem = error.getDefaultMessage();
			String nome = ((FieldError) error).getField();
			
			campo.add(new Campo(nome, menssagem));
		}
		
		Problem problem = new Problem();
		problem.setStatus(status.value());
		problem.setTitulo("Um ou mais campos estão incorretos, tente novamente");
		problem.setDataHora(LocalDateTime.now());
		problem.setCampos(campo);
		
		return super.handleExceptionInternal(ex,problem,headers,status,request);
	}
	
}
