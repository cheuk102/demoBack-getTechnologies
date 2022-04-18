package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Persona;

public interface DirectorioService {

	Persona findPersonaByIdentificacion(String identificacion);

	List<Persona> findPersonas();

	void deletePersonaByIdentificacion(String identificacion);

	Persona storePersona(Persona persona);

}
