package com.example.demo.domain.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Viagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String origem;
	private String destino;
	private String tipo;
	private Date saida;
	private Date chegada;
	private int classe;
	private int passageiros;
	private int escalas;
	private double preco;
	
	public Viagens() {}

	public Viagens(long id, String origem, String destino, String tipo, Date saida, Date chegada, int classe,
			int passageiros, int escalas, double preco) {
		super();
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.tipo = tipo;
		this.saida = saida;
		this.chegada = chegada;
		this.classe = classe;
		this.passageiros = passageiros;
		this.escalas = escalas;
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getChegada() {
		return chegada;
	}

	public void setChegada(Date chegada) {
		this.chegada = chegada;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getEscalas() {
		return escalas;
	}

	public void setEscalas(int escalas) {
		this.escalas = escalas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
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
		Viagens other = (Viagens) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
