package com.bikestore.gateway.impl;

import com.bikestore.gateway.ContratoGateway;
import com.bikestore.gateway.repository.ContratoRepository;
import com.bikestore.model.Contrato;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ContratoGatewayImpl implements ContratoGateway {
    private final ContratoRepository contratoRepository;

    @Override
    public List<Contrato> findAll() {
        return contratoRepository.findAll();
    }

    @Override
    public Optional<Contrato> findById(int id) {
        return contratoRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        contratoRepository.deleteById(id);
    }

    @Override
    public void save(Contrato contrato) {
        contratoRepository.save(contrato);
    }
}