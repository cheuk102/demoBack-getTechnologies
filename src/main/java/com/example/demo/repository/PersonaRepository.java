package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
	Optional<Persona> findByIdentificacion(String identificacion);
	
	void deletePersonaByIdentificacion(String identificacion);

}
