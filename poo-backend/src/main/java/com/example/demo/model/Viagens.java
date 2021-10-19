package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viagens")
public class Viagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "origem", nullable=false)
	private String origem;
	
	@Column(name = "destino",nullable=false)
	private String destino;
	
	@Column(name = "tipoTransporte",nullable=false)
	private String tipoTransporte;
	
	@Column(name = "dataSaida",nullable=false)
	private Date dataSaida;
	
	@Column(name = "dataChegada",nullable=false)
	private Date dataChegada;
	
	@Column(name = "tipoClasse",nullable=false)
	private int tipoClasse;
	
	@Column(name = "passageiros",nullable=false)
	private int passageiros;
	
	@Column(name = "escalas",nullable=false)
	private int escalas;
	
	@Column(name = "preco",nullable=false)
	private double preco;
	
	public Viagens() {
		
	}

	public Viagens(long id, String origem, String destino, String tipoTransporte, Date dataSaida, Date dataChegada,
			int tipoClasse, int passageiros, int escalas, double preco) {
		super();
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.tipoTransporte = tipoTransporte;
		this.dataSaida = dataSaida;
		this.dataChegada = dataChegada;
		this.tipoClasse = tipoClasse;
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

	public String getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public int getTipoClasse() {
		return tipoClasse;
	}

	public void setTipoClasse(int tipoClasse) {
		this.tipoClasse = tipoClasse;
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
	
	
}
