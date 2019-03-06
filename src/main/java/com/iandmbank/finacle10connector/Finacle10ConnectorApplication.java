package com.iandmbank.finacle10connector;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Finacle10ConnectorApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Finacle10ConnectorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started");
	}
}
