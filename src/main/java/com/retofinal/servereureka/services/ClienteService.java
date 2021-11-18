package com.retofinal.servereureka.services;

import java.util.List;

import com.retofinal.servereureka.model.Cliente;

public interface ClienteService {
	
	String addCustomer(Cliente cliente);
	String deleteCustomer(Cliente cliente);
	List<Cliente> listarClientes();
	void updateCustomer(Cliente cliente);
}
