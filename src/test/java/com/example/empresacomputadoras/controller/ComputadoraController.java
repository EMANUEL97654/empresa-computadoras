package com.example.empresacomputadoras.controller;

import com.example.empresacomputadoras.entities.Computadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ComputadoraController {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void findAll() {
        ResponseEntity<Computadora[]> response = testRestTemplate.getForEntity("/api/computadoras",Computadora[].class);
        assertEquals(HttpStatus.OK,response.getStatusCode());
        assertEquals(200,response.getStatusCodeValue());
        List<Computadora> computadoras = Arrays.asList(response.getBody());
        System.out.println(computadoras.size());
    }
    @Test
    void findOneById() {
        ResponseEntity<Computadora> response = testRestTemplate.getForEntity("/api/laptops/1",Computadora.class);

        assertEquals(HttpStatus.NOT_FOUND,response.getStatusCode());
    }
}
