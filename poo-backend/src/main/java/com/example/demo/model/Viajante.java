package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viajantes")
public class Viajante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName",nullable=false)
	private String firstName;
	
	@Column(name = "lastName",nullable=false)
	private String lastName;
	
	@Column(name = "cpf",nullable=false)
	private String cpf;
	
	@Column(name = "destino",nullable=false)
	private String destino;
	
	@Column(name = "origem",nullable=false)
	private String origem;
	
	@Column(name = "idade",nullable=false)
	private int idade;
	
	@Column(name = "bagagem",nullable=false)
	private int bagagem;
	
	@Column(name = "acompanhantes",nullable=false)
	private int acompanhantes;
	
	public Viajante() {
		
	}

	public Viajante(long id, String firstName, String lastName, String cpf, String destino, String origem, int idade,
			int bagagem, int acompanhantes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.destino = destino;
		this.origem = origem;
		this.idade = idade;
		this.bagagem = bagagem;
		this.acompanhantes = acompanhantes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getBagagem() {
		return bagagem;
	}

	public void setBagagem(int bagagem) {
		this.bagagem = bagagem;
	}

	public int getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(int acompanhantes) {
		this.acompanhantes = acompanhantes;
	}
	
	
	
	
}
