package com.lucasladeira.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasladeira.entities.FaixaEtaria;

public interface FaixaEtariaRepository extends JpaRepository<FaixaEtaria, UUID>{

}
