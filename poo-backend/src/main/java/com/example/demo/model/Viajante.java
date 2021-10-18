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
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String LastName;
	@Column(name = "cpf")
	private String CPF;
	@Column(name = "destino")
	private String destino;
	@Column(name = "idade")
	private int idade;
	@Column(name = "bagagem")
	private int bagagem;
	@Column(name = "acompanhantes")
	private int acompanhantes;
	
	public Viajante() {
		
	}
	
	
	public Viajante(long id, String firstName, String lastName, String cPF, String destino, int idade, int bagagem,
			int acompanhantes) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		CPF = cPF;
		this.destino = destino;
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
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
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