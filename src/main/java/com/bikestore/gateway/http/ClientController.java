package com.bikestore.gateway.http;

import com.bikestore.model.Cliente;
import com.bikestore.usecase.ClienteCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@SuppressWarnings("unused")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/bikestore/client")
public class ClientController {

    private final ClienteCrud clienteCrud;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getAllClients() {
        return clienteCrud.findAll();
    }

    @GetMapping("{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente getClientByCPF(@PathVariable(value = "cpf") String cpf) {
        return clienteCrud.findById(cpf);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveClient(@Valid @RequestBody Cliente client) {
        return clienteCrud.create(client);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String updateClient(@Valid @RequestBody Cliente client) {
        return clienteCrud.update(client);
    }

    @DeleteMapping("/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClientById(@PathVariable("cpf") String id) {
        clienteCrud.deleteById(id);
    }
}