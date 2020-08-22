package com.bikestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contrato {

    @Id
    @Column(unique = true)
    private Integer codigoContrato;
    @OneToOne
    private Cliente cliente;
    @OneToMany
    private List<Bicicleta> bicicletas;
    private double valorContrato;

    public void addBicicleta(Bicicleta bicicleta, Contrato contrato) {
        contrato.getBicicletas().add(bicicleta);
    }

    public List<Bicicleta> listarBicicleta(Contrato contrato) {
        return contrato.getBicicletas();
    }
}