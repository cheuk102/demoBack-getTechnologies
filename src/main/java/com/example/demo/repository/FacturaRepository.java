package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

	Optional<List<Factura>> findByPersona(String nombre);
}
