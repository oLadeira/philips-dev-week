package com.lucasladeira.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasladeira.entities.Incidencia;

public interface IncidenciaRepository extends JpaRepository<Incidencia, UUID>{

}
