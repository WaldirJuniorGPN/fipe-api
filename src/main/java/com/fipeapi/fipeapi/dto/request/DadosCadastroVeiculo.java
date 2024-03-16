package com.fipeapi.fipeapi.dto.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroVeiculo(
    @JsonAlias("TipoVeiculo") Integer tipoVeiculo,
    @JsonAlias("Modelo") String modelo,
    @JsonAlias("Marca") String marca,
    @JsonAlias("Valor") String valor
) {
}
