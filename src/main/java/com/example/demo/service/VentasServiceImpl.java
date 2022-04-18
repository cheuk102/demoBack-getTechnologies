package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Factura;
import com.example.demo.repository.FacturaRepository;

@Service
public class VentasServiceImpl implements VentasService {
	
	@Autowired
	FacturaRepository facturaRepository;

	@Override
	public List<Factura> findFacturasByPersona(String nombre) {
		return this.facturaRepository.findByPersona(nombre).get();
	}
	@Override
	public Factura storeFactura(Factura factura) {
		return facturaRepository.save(factura);
	}

}
