package com.cliente.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.entities.Client;
import com.cliente.service.ClientService;

@RequestMapping("/client")
@RestController
@AllArgsConstructor
public class ClientController {

	private ClientService service;

	@PostMapping
	public Client save(@RequestBody Client client){
		return service.save( client );
	}
}