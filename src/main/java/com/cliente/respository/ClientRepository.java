package com.cliente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
