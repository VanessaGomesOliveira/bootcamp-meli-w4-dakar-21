package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Corrida corridaMaluca = new Corrida(
                10000, 1000,
                "Corrida Maluca", 10);

        corridaMaluca.registrarCarro(100, 30, 4, "BMW2021");
        // resultadoParcial = 1.25
        corridaMaluca.registrarMoto(120, 40, 5, "OMG2021");
        // resultadoParcial = 9.6

        Carro carro2 = new Carro(200, 30, 4, "LOL2021");
        // resultadoParcial = 2.5

        Moto moto2 = new Moto(100, 25, 5, "WTF2021");
        // resultadoParcial = 5

        corridaMaluca.registrarCarro(carro2);
        corridaMaluca.registrarMoto(moto2);

//        corridaMaluca.removerVeiculo(carro2);
//        corridaMaluca.removerVeiculoPorPlaca("BMW2021");
//        corridaMaluca.removerVeiculoPorPlaca("OMG2021");

        corridaMaluca.printVencedor();


    }
}
