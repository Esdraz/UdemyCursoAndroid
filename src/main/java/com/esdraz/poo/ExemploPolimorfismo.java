package com.esdraz.poo;

import com.esdraz.poo.heranca.Cachorro;
import com.esdraz.poo.heranca.Passaro;

public class ExemploPolimorfismo {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.cor = "marron";
        cachorro.quantidadesDePatas = 4;
        cachorro.correr();
//        cachorro.latir("Francisco");

        System.out.println("-----------------");

        Passaro passaro = new Passaro();
        passaro.cor = "verde";
        passaro.quantidadesDePatas = 2;
        passaro.correr();
    }
}
