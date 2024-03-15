package com.fipeapi.fipeapi.principal;

import com.fipeapi.fipeapi.service.ConsumoAPI;
import com.fipeapi.fipeapi.service.ConverteDados;

import java.util.Scanner;

public class Principal {

    private final String ENDERECO_INICIAL = "https://parallelum.com.br/fipe/api/v1/";
    private final String ENDERECO_FINAL = "/marcas";
    private Scanner leitura = new Scanner(System.in);
    private ConverteDados conversor = new ConverteDados();
    private ConsumoAPI consumoAPI = new ConsumoAPI();

    public void exibirMenu() {
        System.out.println("""
                Digite o tipo de veículo que deseja pesquisar:
                - Carros
                - Moto
                - Caminhão
                """);
        var tipoVeiculo = leitura.nextLine().toLowerCase();

        if (!tipoVeiculo.equals("carros") && !tipoVeiculo.equals("moto") && !tipoVeiculo.equals("caminhao")) {
            System.out.println("Veículo inválido");
            this.exibirMenu();
        }

        var json = this.consumoAPI.obterDados(this.ENDERECO_INICIAL + this.ENDERECO_FINAL);


    }
}
