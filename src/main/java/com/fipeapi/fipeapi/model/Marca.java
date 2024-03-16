package com.fipeapi.fipeapi.model;

import com.fipeapi.fipeapi.dto.request.DadosCadastroMarca;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Table(name = "marcas")
@Getter
@EqualsAndHashCode(of = "id")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer codigo;
    private String nome;

    public Marca(DadosCadastroMarca dados) {
        this.codigo = dados.codigo();
        this.nome = dados.nome();
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo +
                " Marca: " + this.nome;
    }
}
