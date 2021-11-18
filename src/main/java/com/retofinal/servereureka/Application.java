package com.retofinal.servereureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.retofinal.starter.customereureka.configuration.ListaClientes;

@SpringBootApplication
@EnableEurekaServer
public class Application implements CommandLineRunner {

	@Autowired
	ListaClientes listaClientes;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Inicializar lista clientes starter
		listaClientes.crearClientesSegunPais();
		
	}

}
