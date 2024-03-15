package com.fipeapi.fipeapi.model;

import com.fipeapi.fipeapi.dto.request.DadosCadastroVeiculo;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Table(name = "veiculos")
@Getter
@EqualsAndHashCode(of = "id")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer codigo;
    private String nome;

    public void cadastroVeiculo(DadosCadastroVeiculo dados) {
        this.codigo = dados.codigo();
        this.nome = dados.nome();
    }
}
