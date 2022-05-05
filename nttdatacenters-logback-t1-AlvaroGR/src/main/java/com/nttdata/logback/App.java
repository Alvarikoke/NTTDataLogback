package com.nttdata.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase App creada
 * 
 * @author Alvaro Gonzalez Rando
 */
public class App {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * Se crea el metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int contador = 0;

		do {

			LOG.info("Cadena de relleno {}. {}", contador, App.class.getSimpleName());
			contador++;

		} while (contador < 3000);
		
		LOG.info("Proceso terminado.");

	}

	
}