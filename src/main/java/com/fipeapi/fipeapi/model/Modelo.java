package com.fipeapi.fipeapi.model;

import com.fipeapi.fipeapi.dto.request.DadosCadastroModelo;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Table(name = "modelos")
@Getter
@EqualsAndHashCode(of = "id")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nome;

    public Modelo(DadosCadastroModelo dados) {
        this.codigo = dados.codigo();
        this.nome = dados.nome();
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo + " Modelo: " + this.nome;
    }
}
