package com.company;

public class Carro extends Veiculo {

    public Carro(
            double velocidade, double aceleracao,
            double anguloDeGiro, String placa) {
        super(1000, 4, velocidade,
                aceleracao, anguloDeGiro, placa);
//        this.setAceleracao(aceleracao);
//        this.setVelocidade(velocidade);
//        this.setAnguloDeGiro(anguloDeGiro);
//        this.setPlaca(placa);
    }
}
