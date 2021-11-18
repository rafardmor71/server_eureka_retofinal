package com.retofinal.servereureka.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retofinal.servereureka.model.Cliente;
import com.retofinal.servereureka.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public String addCustomer(Cliente cliente) {
		List<Cliente> listaAdd = clienteRepository.getListaClientes();
		boolean add = listaAdd.add(cliente);
		if(add == false) {
			return "Error to Add Customer";
		}
		return "Add Succesful";
	}

	@Override
	public String deleteCustomer(Cliente cliente) {
		List<Cliente> listaDelete = clienteRepository.getListaClientes();
		boolean deleted = listaDelete.remove(cliente);
		if(deleted == false) {
			return "Error to delete";
		}
		return "Deleted Succesful";
	}

	@Override
	public List<Cliente> listarClientes() {
		return clienteRepository.getListaClientes();
	}

	@Override
	public void updateCustomer(Cliente cliente) {
		List<Cliente> listaUpdate = clienteRepository.getListaClientes();
		listaUpdate.stream().forEach((c)-> {
			//El id debe ser igual al que quiero setear
			if(c.getId() == cliente.getId()) {
				c.setNombre(cliente.getNombre());
				c.setApellidos(cliente.getApellidos());
				c.setEdad(cliente.getEdad());
			}
		});

	}

}
