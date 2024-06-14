package com.esdraz.poo;

public class ExemploPOO {

    public static void main(String[] args) {

        Jogador francisco = new Jogador();

        francisco.kart = "Mario kart";
        francisco.pneu = "Velocidade";
        francisco.planador = "Red with spikes";
        francisco.acelerar();

        Jogador cpu = new Jogador();
        cpu.pneu = "Drift";
        cpu.acelerar();
    }


}

class Jogador {
    String kart;
    String pneu;
    String planador;

    //método
    void acelerar() {
        System.out.printf("Acelerando com os pneus de %s\n", pneu);
    }
}
