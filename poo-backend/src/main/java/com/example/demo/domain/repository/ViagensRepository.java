package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Viagens;

@Repository
public interface ViagensRepository extends JpaRepository<Viagens, Long>{
	
}

