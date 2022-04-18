package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Factura;

public interface VentasService {
	
	List<Factura> findFacturasByPersona(String nombre);
	
	Factura storeFactura(Factura factura);

}
