package com.bikestore.gateway.impl;

import com.bikestore.gateway.BicicletaGateway;
import com.bikestore.gateway.repository.BicicletaRepository;
import com.bikestore.model.Bicicleta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BicicletaGatewayImpl implements BicicletaGateway {

    private final BicicletaRepository bicicletaRepository;

    @Override
    public List<Bicicleta> findAll() {
        return bicicletaRepository.findAll();
    }

    @Override
    public Optional<Bicicleta> findById(int codigoBicicleta) {
        return bicicletaRepository.findById(codigoBicicleta);
    }

    @Override
    public Bicicleta save(Bicicleta bicicleta) {
        return bicicletaRepository.save(bicicleta);
    }

    @Override
    public void deleteById(int id) {
        bicicletaRepository.deleteById(id);
    }
}