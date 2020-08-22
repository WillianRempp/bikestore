package com.bikestore.gateway;

import com.bikestore.model.Contrato;

import java.util.List;
import java.util.Optional;

public interface ContratoGateway {
    List<Contrato> findAll();

    Optional<Contrato> findById(int id);

    void deleteById(int id);

    void save(Contrato contrato);
}
