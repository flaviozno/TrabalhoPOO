package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Viagens;
import com.example.demo.repository.ViagensRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class ViagensController {
	
	@Autowired
	private ViagensRepository viagensRepository;
	
	@GetMapping("/viagens")
	@Transactional(readOnly = true)
	public List<Viagens> getAllViajante(){
		return viagensRepository.findAll();
	}
	
}
