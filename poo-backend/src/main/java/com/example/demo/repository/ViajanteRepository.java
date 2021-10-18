package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Viajante;

@Repository
public interface ViajanteRepository extends JpaRepository<Viajante, Long>{

}
