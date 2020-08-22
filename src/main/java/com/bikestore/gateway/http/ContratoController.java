package com.bikestore.gateway.http;

import com.bikestore.model.Contrato;
import com.bikestore.usecase.ContratoCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@SuppressWarnings("unused")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/bikestore/contract")
public class ContratoController {

    private final ContratoCrud contratoCrud;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Contrato> getAllClients() {
        return contratoCrud.findAll();
    }

    @GetMapping("{codigoContrato}")
    @ResponseStatus(HttpStatus.OK)
    public Contrato getContractsById(@PathVariable(value = "codigoContrato") int codigoContrato) {
        return contratoCrud.findById(codigoContrato);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveContract(@Valid @RequestBody Contrato client) {
        return contratoCrud.create(client);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String updateContract(@Valid @RequestBody Contrato client) {
        return contratoCrud.update(client);
    }

    @DeleteMapping("/{codigoContrato}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContractById(@PathVariable("codigoContrato") int codigoContrato) {
        contratoCrud.deleteById(codigoContrato);
    }
}