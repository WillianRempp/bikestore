package com.bikestore.gateway.impl;

import com.bikestore.gateway.ClienteGateway;
import com.bikestore.gateway.repository.ClienteRepository;
import com.bikestore.model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClienteGatewayImpl implements ClienteGateway {

    private final ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(String cpf) {
        return clienteRepository.findById(cpf);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteById(String id) {
        clienteRepository.deleteById(id);
    }
}