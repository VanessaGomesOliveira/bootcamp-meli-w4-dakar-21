package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corrida {
    private double distancia, premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private HashMap<String, Veiculo> listaDeVeiculos = new HashMap<String, Veiculo>();

    public Corrida(
            double distancia, double premioEmDolares,
            String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public void registrarCarro(
            double velocidade, double aceleracao,
            double anguloDeGiro, String placa) {

        if (listaDeVeiculos.size() < quantidadeVeiculosPermitidos) {
            Carro carro = new Carro(velocidade,
                    aceleracao, anguloDeGiro, placa);
//            carro.setAceleracao(aceleracao);
//            carro.setVelocidade(velocidade);
//            carro.setAnguloDeGiro(anguloDeGiro);
//            carro.setPlaca(placa);

            listaDeVeiculos.put(placa, carro);
            System.out.println("Carro " + placa + " adicionado com sucesso.");

            printVagasRestantes();

        } else {
            System.out.println("Não há mais vagas para essa corrida");
        }

    }

    public void registrarMoto(
            double velocidade, double aceleracao,
            double anguloDeGiro, String placa) {

        if (listaDeVeiculos.size() < quantidadeVeiculosPermitidos) {
            Moto moto = new Moto(velocidade,
                    aceleracao, anguloDeGiro, placa);
//            moto.setAceleracao(aceleracao);
//            moto.setVelocidade(velocidade);
//            moto.setAnguloDeGiro(anguloDeGiro);
//            moto.setPlaca(placa);

            listaDeVeiculos.put(placa, moto);
            System.out.println("Moto " + placa + " adicionada com sucesso.");

            printVagasRestantes();

        } else {
            System.out.println("Não há mais vagas para essa corrida");
        }
    }

    public void registrarVeiculo(Veiculo veiculo) {
//            double velocidade, double aceleracao,
//            double anguloDeGiro, String placa) {

        if (listaDeVeiculos.size() < quantidadeVeiculosPermitidos) {
            String placa = veiculo.getPlaca();

            listaDeVeiculos.put(placa, veiculo);

            if (veiculo.getClass().equals(Carro.class)) {
                System.out.println("Carro " + placa + " adicionado com sucesso.");
            } else {
                System.out.println("Moto " + placa + " adicionada com sucesso.");
            }
            printVagasRestantes();

        } else {
            System.out.println("Não há mais vagas para essa corrida");
        }

    }
    // Overload de registrarMoto()
//    public void registrarMoto(Moto moto) {
////            double velocidade, double aceleracao,
////            double anguloDeGiro, String placa) {
//
//        if (listaDeVeiculos.size() < quantidadeVeiculosPermitidos) {
//            String placa = moto.getPlaca();
//
//            listaDeVeiculos.put(placa, moto);
//            System.out.println("Moto " + placa + " adicionada com sucesso.");
//
//            printVagasRestantes();
//
//        } else {
//            System.out.println("Não há mais vagas para essa corrida");
//        }
//    }

    public void removerVeiculo(Veiculo veiculo) {
        String placa = veiculo.getPlaca();
        removerVeiculoPorPlaca(placa);
    }

    public void removerVeiculoPorPlaca(String placa) {
        if (listaDeVeiculos.containsKey(placa)) {
            listaDeVeiculos.remove(placa);
            System.out.println("Veículo " + placa + " removido com sucesso.");
            printVagasRestantes();
        } else {
            System.out.println("Não existe veículo com a placa " + placa + ".");
            System.out.print("Lista de placas registrada: ");
            System.out.println(listaDeVeiculos.keySet());
            printVagasRestantes();
        }
    }

    public void printVagasRestantes () {
        int vagasRestantes = quantidadeVeiculosPermitidos - listaDeVeiculos.size();
        String vagasStr =
                vagasRestantes > 1 ? " ainda tem " + vagasRestantes + " vagas restantes."
                : vagasRestantes == 1 ? " tem 1 vaga restante."
                : " não tem mais vagas.";
        System.out.println("A corrida " + nome + vagasStr);
    }

//    String resultado =  valor == true ? "okay" : "Nao okay";

    public void printVencedor() {
        String placaVencedor = "";
        double resultadoFinal = 0;

        if (listaDeVeiculos.size() == 0) {
            System.out.println("Não há veículos para correr");
        } else {
            for (Map.Entry<String, Veiculo> pair : listaDeVeiculos.entrySet()) {
                String placa = pair.getKey();
                Veiculo veiculo = pair.getValue();
                double resultadoParcial = veiculo.resultado();

                if (resultadoParcial > resultadoFinal) {
                    resultadoFinal = resultadoParcial;
                    placaVencedor = placa;
                }
            }
            System.out.println("O vencedor é o veículo de placa " + placaVencedor);
        }
    }

}
