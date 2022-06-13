package com.example.empresacomputadoras.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="computadoras")
public class Computadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private Double precio;
    private Double memoria;
    private String procesador;

    public Computadora() {
    }

    public Computadora(Long id, String modelo, Double precio, Double memoria, String procesador) {
        this.id = id;
        this.modelo = modelo;
        this.precio = precio;
        this.memoria = memoria;
        this.procesador = procesador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Double getMemoria() {
        return memoria;
    }

    public void setMemoria(Double memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
