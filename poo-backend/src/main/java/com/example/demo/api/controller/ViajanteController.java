package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Viajante;
import com.example.demo.domain.repository.ViajanteRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/viajante")
@RestController
public class ViajanteController {
	
	@Autowired
	private ViajanteRepository viajanteRepository;
	
	@GetMapping
	public List<Viajante> listar(){
		return viajanteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Viajante adicionar(@RequestBody Viajante viajante) {
		return viajanteRepository.save(viajante);
	}
	
	
}
