package com.fipeapi.fipeapi.dto.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroModelo(
        @JsonAlias("codigo") String codigo,
        @JsonAlias("nome") String nome
) {
}
