package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Persona;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.PersonaRepository;

@Service
public class DirectorioServiceImpl implements DirectorioService {
	
	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Persona findPersonaByIdentificacion(String identificacion) {
		Optional<Persona> personaDb = this.personaRepository.findByIdentificacion(identificacion);
		
		
		if (personaDb.isPresent()) {
			return personaDb.get();
		} else {
			throw new ResourceNotFoundException("Registro no encontrado");
		}
	}

	@Override
	public List<Persona> findPersonas() {
		return this.personaRepository.findAll();
	}

	@Override
	public void deletePersonaByIdentificacion(String identificacion) {
		Optional<Persona> personaDb = this.personaRepository.findByIdentificacion(identificacion);
		
		if (personaDb.isPresent()) {
			this.personaRepository.delete(personaDb.get());
		} else {
			throw new ResourceNotFoundException("Registro no encontrado");
		}
	}

	@Override
	public Persona storePersona(Persona persona) {
		return personaRepository.save(persona);
	}

}
