package com.esdraz.poo.heranca;

public class Cachorro  extends Animal{

    public void latir() {
        System.out.println("Latindo...");
    }

    //sobrecarga é um tipo de polimorfismo
    public void latir(String pessoa) {
        System.out.println("Latindo para " + pessoa);
    }

    @Override
    public void correr() {
        super.correr(); //implementação padrão
        System.out.println("cachorro de " + this.quantidadesDePatas + " patas");
    }
}
