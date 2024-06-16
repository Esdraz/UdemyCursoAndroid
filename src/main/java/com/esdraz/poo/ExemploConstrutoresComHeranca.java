package com.esdraz.poo;

import com.esdraz.poo.heranca.Cachorro;
import com.esdraz.poo.heranca.Passaro;

public class ExemploConstrutoresComHeranca {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Marron", 7, 4, 20.0);
        cachorro.correr();
        System.out.println("-----------------");

        Passaro passaro = new Passaro("Verde", 2, 2, 0.50);
        passaro.correr();

    }
}
