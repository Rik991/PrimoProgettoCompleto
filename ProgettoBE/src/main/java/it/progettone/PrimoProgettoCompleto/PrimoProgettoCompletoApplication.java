package it.progettone.PrimoProgettoCompleto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"it.progettone.PrimoProgettoCompleto.core", "it.progettone.PrimoProgettoCompleto.web"})
public class PrimoProgettoCompletoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimoProgettoCompletoApplication.class, args);
	}
}