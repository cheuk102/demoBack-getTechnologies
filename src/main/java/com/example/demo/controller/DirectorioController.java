package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Persona;
import com.example.demo.service.DirectorioService;


@RestController()
public class DirectorioController {

	@Autowired
	DirectorioService directorioService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/personas")
	public ResponseEntity<List<Persona>> findPersonas() {
		return ResponseEntity.ok().body(directorioService.findPersonas());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/persona")
	public ResponseEntity<Persona> storePersona(@RequestBody Persona persona) {
		return ResponseEntity.ok().body(this.directorioService.storePersona(persona));
	}
	
	@DeleteMapping("/persona/{identificacion}")
	public HttpStatus deletePersonaByIdentificacion(@PathVariable String identificacion) {
		this.directorioService.deletePersonaByIdentificacion(identificacion);
		return HttpStatus.OK;
	}
	
	@GetMapping("/persona/{identificacion}")
	public ResponseEntity<Persona> findPersonaByIdentificacion(@PathVariable String identificacion) {
		return ResponseEntity.ok().body(this.directorioService.findPersonaByIdentificacion(identificacion));
	}
	
	
	
}
