package com.example.empresacomputadoras.repository;

import com.example.empresacomputadoras.entities.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputadoraRepository extends JpaRepository<Computadora,Long> {
}
