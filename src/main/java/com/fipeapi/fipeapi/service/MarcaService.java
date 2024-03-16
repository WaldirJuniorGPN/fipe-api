package com.fipeapi.fipeapi.service;

import com.fipeapi.fipeapi.dto.request.DadosCadastroMarca;
import com.fipeapi.fipeapi.model.Marca;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class MarcaService {

    private String json;
    private ConverteDados conversor = new ConverteDados();
    private List<Marca> marcas = new ArrayList<>();

    public MarcaService(){}
    public MarcaService(String json) {
        this.json = json;
    }

    public void obterMarcas() {
        var listaMarcas = this.conversor.obterDadosEmLista(json, DadosCadastroMarca.class);
        listaMarcas.forEach(dadosCadastroMarca -> this.marcas.add(new Marca(dadosCadastroMarca)));
        this.marcas.stream().sorted(Comparator.comparing(Marca::getCodigo)).forEach(System.out::println);
    }
}
