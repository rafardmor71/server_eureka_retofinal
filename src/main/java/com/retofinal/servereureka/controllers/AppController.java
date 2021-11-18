package com.retofinal.servereureka.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retofinal.servereureka.model.Cliente;
import com.retofinal.servereureka.services.ClienteService;
import com.retofinal.starter.customereureka.configuration.ListaClientes;

@RestController
public class AppController {

	@Autowired
	ClienteService clienteService;
	
	@Autowired
	ListaClientes listaClientes;
	
	@RequestMapping(path="/addClientes", method = RequestMethod.POST)
	public String addCustomer(@RequestBody Cliente cliente) {
		return clienteService.addCustomer(cliente);
	}
	
	@RequestMapping(path="/updateClientes", method = RequestMethod.PUT)
	public String updateCustomer(@RequestBody Cliente cliente) {
		//NO MODIFICAR ID
		clienteService.updateCustomer(cliente);
		return "Update Successful";
	}
	
	
	@RequestMapping(path="/listarClientes", method = RequestMethod.GET)
	public List<Cliente> listarClientes() {
		
		return clienteService.listarClientes();
	}
	
	@RequestMapping(path="/listarClientesStarter", method = RequestMethod.GET)
	public List<com.retofinal.startereureka.customereureka.reto.model.Cliente> listarClientesStarter() {
		
		return listaClientes.getListaClientes();
	}
	
	@RequestMapping(path="/deleteClientes", method = RequestMethod.DELETE)
	public String deleteCustomer(@RequestBody Cliente cliente) {
		return clienteService.deleteCustomer(cliente);
	}
	
}
