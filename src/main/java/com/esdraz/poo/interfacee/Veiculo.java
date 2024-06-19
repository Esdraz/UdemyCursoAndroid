package com.esdraz.poo.interfacee;

public class Veiculo implements LigarDesligar, Acelerar, Frear {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando o carro para " + velocidade + " KM/h!");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o carro!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro!");
    }
}
