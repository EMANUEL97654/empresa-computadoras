package com.example.empresacomputadoras.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2);
    }

    private ApiInfo apiDetails(){
        return new ApiInfo("Spring Boot Computadoras API REST","Computadoras Api REST docs","1.8","http://www.google.com",new Contact("Emanuel","http://www.google.com","gonzlezgartlandemanuel@gmail.com"),"Mit","http://www.google.com", Collections.emptyList());
    }
}
