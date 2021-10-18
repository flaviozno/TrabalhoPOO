package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Viajante;
import com.example.demo.repository.ViajanteRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class ViajanteController {

	@Autowired
	private ViajanteRepository viajanteRepository;
	
	@GetMapping("/viajante")
	public List<Viajante> getAllViajante(){
		return viajanteRepository.findAll();
	}
	
	@PostMapping("/viajante")
	public Viajante createViajante(@RequestBody Viajante viajante) {
		return viajanteRepository.save(viajante);
	}
}
