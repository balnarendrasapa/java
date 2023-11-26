package com.bnsapa.javapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bnsapa.javapp.services.ColourPrinter;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class JavappApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public JavappApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	@Override
	public void run(final String... args) {
		log.info(colourPrinter.print());
	}

	public static void main(String[] args) {
		SpringApplication.run(JavappApplication.class, args);
	}

}
