package com.bikestore.gateway;

import com.bikestore.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteGateway {
    List<Cliente> findAll();

    Optional<Cliente> findById(String cpf);

    Cliente save(Cliente cliente);

    void deleteById(String id);
}
