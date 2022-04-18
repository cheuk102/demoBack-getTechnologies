package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Factura;
import com.example.demo.entities.Persona;
import com.example.demo.service.VentasService;

@RestController
public class VentasController {
	
	@Autowired
	VentasService ventasService;
	
	@PostMapping("/venta")
	public ResponseEntity<Factura> storePersona(@RequestBody Factura factura) {
		return ResponseEntity.ok().body(this.ventasService.storeFactura(factura));
	}
	
	@GetMapping("/venta/{nombre}")
	public ResponseEntity<List<Factura>> findFacturasByPersona(@PathVariable String nombre) {
		return ResponseEntity.ok().body(this.ventasService.findFacturasByPersona(nombre));
	}

}
