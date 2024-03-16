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
    private Integer tipoVeiculo;
    private String modelo;
    private String marca;
    private String valor;

    public Veiculo(DadosCadastroVeiculo dados) {
        this.tipoVeiculo = dados.tipoVeiculo();
        this.modelo = dados.modelo();
        this.marca = dados.marca();
        this.valor = dados.valor();
    }

    @Override
    public String toString() {
        return "Tipo do Veículo: " + this.tipoVeiculo +
                "\nModelo: " + this.modelo +
                "\nMarca: " + this.modelo +
                "\nValor: " + this.valor;
    }
}
