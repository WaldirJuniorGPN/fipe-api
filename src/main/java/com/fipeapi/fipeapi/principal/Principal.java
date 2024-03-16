package com.fipeapi.fipeapi.principal;

import com.fipeapi.fipeapi.service.ConsumoAPI;
import com.fipeapi.fipeapi.service.MarcaService;
import com.fipeapi.fipeapi.service.ModelosService;

import java.util.Scanner;

public class Principal {

    private final String ENDERECO_INICIAL = "https://parallelum.com.br/fipe/api/v1/";
    private final String ENDERECO_FINAL = "/marcas";
    private final String MODELO = "/modelos";
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();

    public void exibirMenu() {
        System.out.println("""
                Digite o tipo de veículo que deseja pesquisar:
                - Carros
                - Motos
                - Caminhões
                """);
        var tipoVeiculo = leitura.nextLine().toLowerCase();
        System.out.println(this.ENDERECO_INICIAL + tipoVeiculo + this.ENDERECO_FINAL);
        if (!tipoVeiculo.equals("carros") && !tipoVeiculo.equals("motos") && !tipoVeiculo.equals("caminhaos")) {
            System.out.println("Veículo inválido");
            this.exibirMenu();
        }
        var json = this.consumoAPI.obterDados(this.ENDERECO_INICIAL + tipoVeiculo + this.ENDERECO_FINAL);
        new MarcaService(json).obterMarcas();

        System.out.println("\nDigite o código da Marca");
        var codigoMarca = leitura.nextLine();
        json = this.consumoAPI.obterDados(json + "/" + codigoMarca + this.MODELO);
        new ModelosService(json).obterModelos();


    }
}
