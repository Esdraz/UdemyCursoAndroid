package com.esdraz.poo.construtor;

public class ExemploConstrutores {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("francisco@gmail.com", "mudar@123");

        System.out.printf("Usuário: %s\nSenha: %s\n", usuario.email, usuario.senha);
        usuario.verificarUsuarioLogado();
    }
}
