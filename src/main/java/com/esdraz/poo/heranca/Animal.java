package com.esdraz.poo.heranca;

//Classe pai (Super Classe)
//Classe abstrata, serve como "molde" para as classes filhas (sub-classes)
public abstract class Animal {

    public String cor;
    public int tamanho;
    public int quantidadesDePatas;
    public double peso;

    public Animal() {
    }

    public Animal(String cor, int tamanho, int quantidadesDePatas, double peso) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadesDePatas = quantidadesDePatas;
        this.peso = peso;
    }

    public void correr() {
        System.out.println("Correr como um ");
    }

    public void dormir() {
        System.out.println("Dormir...");
    }

    public abstract void comer();
}
