package com.company;

public abstract class Veiculo {
    private double velocidade, aceleracao, anguloDeGiro, peso;
    private String placa;
    private int rodas;

    public Veiculo(double peso, int rodas, double velocidade,
                   double aceleracao, double anguloDeGiro, String placa) {
        this.peso = peso;
        this.rodas = rodas;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
    }

    public double resultado() {
        return velocidade * aceleracao / (anguloDeGiro * (peso - rodas * 100));
    }
    public String getPlaca() {
        return placa;
    }

//    public void setVelocidade(double velocidade) {
//        this.velocidade = velocidade;
//    }
//
//    public void setAceleracao(double aceleracao) {
//        this.aceleracao = aceleracao;
//    }
//
//    public void setAnguloDeGiro(double anguloDeGiro) {
//        this.anguloDeGiro = anguloDeGiro;
//    }
//
//    public void setPlaca(String placa) {
//        this.placa = placa;
//    }

}
