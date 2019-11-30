package com.cliente.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.cliente.entities.Client;
import com.cliente.respository.ClientRepository;

@Service
@AllArgsConstructor
public class ClientService {

	private ClientRepository repository;

	public Client save(Client client){
		return repository.save( client );
	}

}
