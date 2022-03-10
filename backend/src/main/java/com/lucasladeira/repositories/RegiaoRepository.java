package com.lucasladeira.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasladeira.entities.Regiao;

public interface RegiaoRepository extends JpaRepository<Regiao, UUID>{

}
