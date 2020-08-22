package com.bikestore.usecase;

import com.bikestore.gateway.ContratoGateway;
import com.bikestore.model.Contrato;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class ContratoCrud {

    private final ContratoGateway contratoGateway;

    public List<Contrato> findAll() {
        return contratoGateway.findAll();
    }

    public Contrato findById(int id) {
        return contratoGateway.findById(id).orElse(null);
    }

    public String create(Contrato contrato) {
        if (!Objects.nonNull(findById(contrato.getCodigoContrato()))) {
            contratoGateway.save(contrato);
            return "Resource created";
        } else {
            return "Resource was already created";
        }
    }

    public void deleteById(int id) {
        contratoGateway.deleteById(id);
    }

    public String update(Contrato contrato) {
        if (Objects.nonNull(findById(contrato.getCodigoContrato()))) {
            contratoGateway.save(contrato);
            return "Resource updated";
        } else {
            return "Resource Not Found";
        }
    }
}
