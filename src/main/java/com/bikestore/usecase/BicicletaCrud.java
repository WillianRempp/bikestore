package com.bikestore.usecase;

import com.bikestore.gateway.BicicletaGateway;
import com.bikestore.model.Bicicleta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class BicicletaCrud {

    private final BicicletaGateway bicicletaGateway;

    public List<Bicicleta> findAll() {
        return bicicletaGateway.findAll();
    }

    public Bicicleta findById(int codigoBicicleta) {
        return bicicletaGateway.findById(codigoBicicleta).orElse(null);
    }

    public String create(Bicicleta bicicleta) {
        if (!Objects.nonNull(findById(bicicleta.getCodigoBicicleta()))) {
            bicicletaGateway.save(bicicleta);
            return "Resource created";
        } else {
            return "Resource was already created";
        }
    }

    public void deleteById(int id) {
        bicicletaGateway.deleteById(id);
    }

    public String update(Bicicleta bicicleta) {
        if (Objects.nonNull(findById(bicicleta.getCodigoBicicleta()))) {
            bicicletaGateway.save(bicicleta);
            return "Resource updated";
        } else {
            return "Resource Not Found";
        }
    }
}
