package com.esdraz.poo.heranca;

public class Passaro extends Animal{

    public Passaro() {
    }

    //Construtor herdando as caracteristicas da classe Animal
    public Passaro(String cor, int tamanho, int quantidadesDePatas, double peso) {
        super(cor, tamanho, quantidadesDePatas, peso);
    }

    public void voar() {
        System.out.println("Voando...");
    }

    @Override
    public void correr() {
        super.correr(); //implementação padrão
        System.out.println("passado de " + this.quantidadesDePatas + " patas");
    }

    @Override
    public void comer() {
        System.out.println("comendo alpiste...");
    }
}
