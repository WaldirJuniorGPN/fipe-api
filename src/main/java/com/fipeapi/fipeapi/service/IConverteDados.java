package com.fipeapi.fipeapi.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
