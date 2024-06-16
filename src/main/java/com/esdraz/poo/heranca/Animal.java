package com.esdraz.poo.heranca;

//Classe pai (Super Classe)
public class Animal {

    public String cor;
    public int tamanho;
    public int quantidadesDePatas;
    public double peso;

    public void correr() {
        System.out.println("Correr como um ");
    }

    public void dormir() {
        System.out.println("Dormir...");
    }
}
