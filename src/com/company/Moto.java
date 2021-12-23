package com.company;

public class Moto extends Veiculo {

    public Moto(
            double velocidade, double aceleracao,
            double anguloDeGiro, String placa) {
        super(300, 2, velocidade,
                aceleracao, anguloDeGiro, placa);
    }
}
