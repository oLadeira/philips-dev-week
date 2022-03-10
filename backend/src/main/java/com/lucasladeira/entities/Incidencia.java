package com.lucasladeira.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Incidencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	private Integer mes;
	
	private Integer quantidadeExames;
	
	@OneToOne
	private Regiao regiaoId;
	
	private FaixaEtaria faixaId;

	public Incidencia() {};
	
	public Incidencia(UUID id, Integer mes, Integer quantidadeExames, Regiao regiaoId, FaixaEtaria faixaId) {
		super();
		this.id = id;
		this.mes = mes;
		this.quantidadeExames = quantidadeExames;
		this.regiaoId = regiaoId;
		this.faixaId = faixaId;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getQuantidadeExames() {
		return quantidadeExames;
	}

	public void setQuantidadeExames(Integer quantidadeExames) {
		this.quantidadeExames = quantidadeExames;
	}

	public Regiao getRegiaoId() {
		return regiaoId;
	}

	public void setRegiaoId(Regiao regiaoId) {
		this.regiaoId = regiaoId;
	}

	public FaixaEtaria getFaixaId() {
		return faixaId;
	}

	public void setFaixaId(FaixaEtaria faixaId) {
		this.faixaId = faixaId;
	}
}
