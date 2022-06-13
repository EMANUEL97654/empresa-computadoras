package com.example.empresacomputadoras;

import com.example.empresacomputadoras.entities.Computadora;
import com.example.empresacomputadoras.repository.ComputadoraRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class EmpresaComputadorasApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EmpresaComputadorasApplication.class, args);
		ComputadoraRepository repository = context.getBean(ComputadoraRepository.class);

		Computadora computadora1 = new Computadora(null,"Commodore",5050.85,985.5,"Intel Core i5 10500" );
		Computadora computadora2 = new Computadora(null,"Asus",6000.90,500d,"Intel Core i7" );
		Computadora computadora3 = new Computadora(null,"Commodore",5600.85,1000d,"Intel Core i3 10100f" );
		Computadora computadora4 = new Computadora(null,"Dell",5050.85,1000d,"Intel Core i9" );
		Computadora computadora5 = new Computadora(null,"Lenovo",4000d,1500d,"Intel Core i3" );
		Computadora computadora6 = new Computadora(null,"Apple",8000d,500d,"Chip M1" );

		repository.save(computadora1);
		repository.save(computadora2);
		repository.save(computadora3);
		repository.save(computadora4);
		repository.save(computadora5);
		repository.save(computadora6);


	}

}
