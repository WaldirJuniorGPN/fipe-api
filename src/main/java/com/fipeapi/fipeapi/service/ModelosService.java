package com.fipeapi.fipeapi.service;

import com.fipeapi.fipeapi.dto.request.DadosCadastroModelo;
import com.fipeapi.fipeapi.model.Modelo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModelosService {
    private String json;
    private ConverteDados conversor = new ConverteDados();
    private List<Modelo> modelos = new ArrayList<>();

    public ModelosService() {
    }

    public ModelosService(String json) {
        this.json = json;
    }

    public void obterModelos() {
        var listaModelos = this.conversor.obterDadosEmLista(this.json, DadosCadastroModelo.class);
        listaModelos.forEach(dadosCadastroModelo -> this.modelos.add(new Modelo(dadosCadastroModelo)));
        this.modelos.stream().sorted(Comparator.comparing(Modelo::getNome)).forEach(System.out::println);
    }
}
