package com.retofinal.servereureka.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.retofinal.servereureka.model.Cliente;
import com.retofinal.servereureka.model.ClienteBuilder;

@Component
public class ClienteRepository {
	private List<Cliente> listaClientes = new ArrayList<>();
	
	public ClienteRepository() {
		ClienteBuilder clb = new ClienteBuilder();
		Cliente cl1 = clb.withId(1L).withNombre("Pepe").withApellidos("Gutierrez Beltrán").withEdad(29).build();
		Cliente cl2 = clb.withId(2L).withNombre("Lucas").withApellidos("Beltrán Torres").withEdad(59).build();
		Cliente cl3 = clb.withId(3L).withNombre("Marco").withApellidos("Alonso Beltrán").withEdad(19).build();
		Cliente cl4 = clb.withId(4L).withNombre("Pilar").withApellidos("Medina Galan").withEdad(34).build();
		listaClientes.add(cl1);
		listaClientes.add(cl2);
		listaClientes.add(cl3);
		listaClientes.add(cl4);
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	
}
