package com.esdraz.poo.construtor;

public class Usuario {

    String email;
    String senha;

    public Usuario(String email, String senha) {
        System.out.println("Executando o construtor");
        this.email = email;
        this.senha = senha;
    }

    void verificarUsuarioLogado() {
        System.out.println("Usuário logado com sucesso!");
    }
}
