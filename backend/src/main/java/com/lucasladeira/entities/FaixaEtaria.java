package com.lucasladeira.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FaixaEtaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	private Long faixa_i;
	private Long faixa_n;
	
	private String descricao;

	
	public FaixaEtaria() {}
	
	public FaixaEtaria(UUID id, Long faixa_i, Long faixa_n, String descricao) {
		super();
		this.id = id;
		this.faixa_i = faixa_i;
		this.faixa_n = faixa_n;
		this.descricao = descricao;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getFaixa_i() {
		return faixa_i;
	}

	public void setFaixa_i(Long faixa_i) {
		this.faixa_i = faixa_i;
	}

	public Long getFaixa_n() {
		return faixa_n;
	}

	public void setFaixa_n(Long faixa_n) {
		this.faixa_n = faixa_n;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
