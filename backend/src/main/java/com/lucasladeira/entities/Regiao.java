package com.lucasladeira.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regiao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private UUID id;

	private String regiao;
	private Long total_exames;

	
	public Regiao() {}
		
	public Regiao(UUID id, String regiao, Long total_exames) {
		super();
		this.id = id;
		this.regiao = regiao;
		this.total_exames = total_exames;
	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Long getTotal_exames() {
		return total_exames;
	}

	public void setTotal_exames(Long total_exames) {
		this.total_exames = total_exames;
	}
}
