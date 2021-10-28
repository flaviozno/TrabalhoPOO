package com.example.demo.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Viagens;
import com.example.demo.domain.repository.ViagensRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
@RestController
public class ViagensController {
	
	@Autowired
	private ViagensRepository viagensRepository;
	
	@GetMapping("/viagens")
	@Transactional(readOnly = true)
	public List<Viagens> listar() {
		return viagensRepository.findAll();
	}
	
	@PutMapping("/viagens/{id}")
	public ResponseEntity<Viagens> atualizar(@Valid @PathVariable Long id, @RequestBody Viagens viagens){
		if(!viagensRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		viagens.setId(id);
		viagens = viagensRepository.save(viagens);
		return ResponseEntity.ok(viagens);
	}
	
}
