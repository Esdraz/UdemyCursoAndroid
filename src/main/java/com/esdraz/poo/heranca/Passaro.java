package com.esdraz.poo.heranca;

public class Passaro extends Animal{

    public void voar() {
        System.out.println("Voando...");
    }

    @Override
    public void correr() {
        super.correr(); //implementação padrão
        System.out.println("passado de " + this.quantidadesDePatas + " patas");
    }
}
