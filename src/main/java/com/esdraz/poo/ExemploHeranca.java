package com.esdraz.poo;

import com.esdraz.poo.heranca.Cachorro;
import com.esdraz.poo.heranca.Passaro;

public class ExemploHeranca {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.cor = "marron";
        cachorro.correr();
        cachorro.dormir();
        cachorro.latir();

        Passaro passaro = new Passaro();

        passaro.cor = "verde";
        passaro.correr();
        passaro.dormir();
        passaro.voar();
    }
}
