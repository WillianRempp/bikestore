package com.bikestore.usecase;

import com.bikestore.gateway.ClienteGateway;
import com.bikestore.model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class ClienteCrud {

    private final ClienteGateway clienteGateway;

    public List<Cliente> findAll() {
        return clienteGateway.findAll();
    }

    public Cliente findById(String cpf) {
        return clienteGateway.findById(cpf).orElse(null);
    }

    public String create(Cliente cliente) {
        if (!Objects.nonNull(findById(cliente.getCpf()))) {
            clienteGateway.save(cliente);
            return "Resource created";
        } else {
            return "Resource was already created";
        }
    }

    public void deleteById(String id) {
        clienteGateway.deleteById(id);
    }

    public String update(Cliente customer) {
        if (Objects.nonNull(findById(customer.getCpf()))) {
            clienteGateway.save(customer);
            return "Resource updated";
        } else {
            return "Resource Not Found";
        }
    }
}
