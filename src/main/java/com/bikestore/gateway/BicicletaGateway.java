package com.bikestore.gateway;

import com.bikestore.model.Bicicleta;

import java.util.List;
import java.util.Optional;

public interface BicicletaGateway {
    List<Bicicleta> findAll();

    Optional<Bicicleta> findById(int codigoBicicleta);

    Bicicleta save(Bicicleta bicicleta);

    void deleteById(int id);
}