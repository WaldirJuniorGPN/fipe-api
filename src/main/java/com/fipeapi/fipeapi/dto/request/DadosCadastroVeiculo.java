package com.fipeapi.fipeapi.dto.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroVeiculo(
    @JsonAlias("codigo") Integer codigo,
    @JsonAlias("nome") String nome
) {
}
