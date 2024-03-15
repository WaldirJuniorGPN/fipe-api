package com.fipeapi.fipeapi;

import com.fipeapi.fipeapi.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		new Principal().exibirMenu();
	}
}
