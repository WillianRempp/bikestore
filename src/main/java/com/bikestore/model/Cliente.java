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
public class Cliente {


    @Id
    @Column(unique = true)
    private String cpf;
    private String nome;
    private int codigo;
    private String telefone;
}
