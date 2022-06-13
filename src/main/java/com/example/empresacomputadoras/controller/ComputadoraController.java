package com.example.empresacomputadoras.controller;

import com.example.empresacomputadoras.entities.Computadora;
import com.example.empresacomputadoras.repository.ComputadoraRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ComputadoraController {

    private ComputadoraRepository computadoraRepository;

    public ComputadoraController(ComputadoraRepository computadoraRepository) {
        this.computadoraRepository = computadoraRepository;
    }

    @GetMapping("/api/computadoras")
    public List<Computadora> findAll(){
        return computadoraRepository.findAll();
    }

    @GetMapping("/api/computadoras/{id}")
    public ResponseEntity<Computadora> findOneById(@PathVariable Long id){
        Optional<Computadora> computadoraOpt = computadoraRepository.findById(id);
        if(computadoraOpt.isPresent())
            return ResponseEntity.ok(computadoraOpt.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/computadoras")
    public Computadora create(@RequestBody Computadora computadora){
        return computadoraRepository.save(computadora);
    }

    @PutMapping("api/computadoras")
    public ResponseEntity<Computadora> update(@RequestBody Computadora computadora){
        if(computadora.getId() == null){
            return ResponseEntity.notFound().build();
        }
        if(!computadoraRepository.existsById(computadora.getId())){
            return ResponseEntity.notFound().build();
        }
        Computadora result = computadoraRepository.save(computadora);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/api/computadoras/{id}")
    public ResponseEntity<Computadora> delete(@PathVariable Long id){
        if(!computadoraRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        computadoraRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/api/computadoras")
    public ResponseEntity<Computadora> deleteAll(){
        computadoraRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
