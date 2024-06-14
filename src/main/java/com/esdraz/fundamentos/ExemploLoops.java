package com.esdraz.fundamentos;

public class ExemploLoops {
    public static void main(String[] args) {

        //while
        int numero = 1;
        while (numero <= 5) {
            System.out.printf("numero: %s\n", numero);
            numero++;
        }
        System.out.println();

        // Simulando um menu de postagens...
        String[] postagens = {
                "Fui a praia",
                "Fazendo trilha",
                "Fui pescar",
                "Estudando java e kotlin",
        };

//        int numeroArray = 0;
//        while (numeroArray < postagens.length) {
//            System.out.println("------------------------------------");
//            System.out.printf("postagem #%d: %s\n", numeroArray + 1, postagens[numeroArray]);
//            numeroArray++;
//        }

        // for
        for (int i = 0; i < postagens.length; i++) {
            System.out.println("------------------------------------");
            System.out.printf("postagem #%d: %s\n", i + 1, postagens[i]);
        }
        System.out.println();

        //do... while...
        int numeroTeste = 6;
        do {
            System.out.println("teste do while...");
            numeroTeste++;
        } while (numeroTeste <= 5);
    }
}
