package com.example.demo.domain.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Viajante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	@NotNull
	private String sobrenome;
	@NotNull
	private String cpf;
	@NotNull
	private String destino;
	@NotNull
	private String origem;
	private int idade;
	private int bagagem;
	private int acompanhantes;

	public Viajante() {
		
	}
	
	public Viajante(long id, String nome, String sobrenome, String cpf, String destino, String origem, int idade,
			int bagagem, int acompanhantes) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viajante other = (Viajante) obj;
		return Objects.equals(id, other.id);
	}
	
 
	
}
