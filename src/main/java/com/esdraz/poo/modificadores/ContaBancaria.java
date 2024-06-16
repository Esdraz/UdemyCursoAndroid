package com.esdraz.poo.modificadores;

//public -> Todas as classes terão acesso
//private -> Apenas pode ser acessado de dentro da classe
//protected -> pode ser acessado dentro do mesmo pacote e /ou subclasse (classe filha)
//default -> Caso não tenha sido definido nenhum modificador, permite acesso dentro do pacote e classe

public class ContaBancaria {

    private double saldo = 0;

    //metodo pode ser acessado por todas as classes
    public void sacar() {
        System.out.println("Sacando dinheiro da conta...");
    }

    public void transferir() {
        System.out.println("Transferindo dinheiro...");
    }
}
