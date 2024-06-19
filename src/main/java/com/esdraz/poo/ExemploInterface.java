package com.esdraz.poo;

import com.esdraz.poo.interfacee.Veiculo;

public class ExemploInterface {
    public static void main(String[] args) {

        Veiculo fiat = new Veiculo();

        fiat.ligar();
        fiat.acelerar(70);
        fiat.frear();
        fiat.desligar();

    }
}
