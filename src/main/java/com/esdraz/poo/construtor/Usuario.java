package com.esdraz.poo.construtor;

public class Usuario {

    String email;
    String senha;

    //sobrecarga de construtores
    public Usuario(String email, String senha) {
        System.out.println("Autenticação por e-mail e senha");
        this.email = email;
        this.senha = senha;
    }
    public Usuario(String telefone) {
        System.out.println("Autenticação por telefone");
    }

    void verificarUsuarioLogado() {
        System.out.println("Usuário logado com sucesso!");
    }

    //sobrecarga de métodos
    void logar(String email, String senha) {
        System.out.println("Autenticando com e-mail e senha");
    }

    void logar(String telefone) {
        System.out.println("Autenticando com telefone");
    }
}
