package com.bikestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Bicicleta {

    @Id
    @Column(unique = true, name = "CODIGOBICICLETA")
    private Integer codigoBicicleta;
    private String cor;
    private String tipo;
    private int marcha;
    private double valorAluguel;
}
