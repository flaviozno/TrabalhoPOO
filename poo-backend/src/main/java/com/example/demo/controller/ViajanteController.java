package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Viajante;
import com.example.demo.repository.ViajanteRepository;

@RestController
@RequestMapping("/api/")
public class ViajanteController {

	@Autowired
	private ViajanteRepository viajanteRepository;
	
	@GetMapping("/viajante")
	public List<Viajante> getAllViajante(){
		return viajanteRepository.findAll();
	}
}
