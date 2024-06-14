package com.esdraz.fundamentos;

public class ExemploArrays {
    public static void main(String[] args) {

        String[] nomes = {"Jose", "Maria", "Pedro"};
        System.out.println(nomes[1]);

        int[] numeros = {100, 200, 5, 999};
        System.out.println(numeros[3]);

        // Array multidimensional
        String[][] conversas = {
                {"João", "Olá, tudo bem?"},
                {"Maria", "Tudo certo!"},
                {"Pedro", "Não vi"},
        };
        System.out.println("Array multidimensional:");
        System.out.println(conversas[0][1]);
    }
}
