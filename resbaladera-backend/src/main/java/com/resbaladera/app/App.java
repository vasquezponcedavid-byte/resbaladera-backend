package com.resbaladera.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Esta es la clase principal de la aplicación Resbaladera Backend.
 * Utiliza la anotación @SpringBootApplication para autoconfigurar la aplicación,
 * habilitar el escaneo de componentes y configurar la inyección de dependencias.
 */
@SpringBootApplication
public class App {

	/**
	 * El método principal que inicia la aplicación de Spring Boot.
	 *
	 * @param args Argumentos de la línea de comandos.
	 */
	public static void main(String[] args) {
		// Inicia el contexto de la aplicación Spring.
		// Esto activa la autoconfiguración, escanea componentes y arranca el servidor web integrado.
		SpringApplication.run(App.class, args);
	}

}
