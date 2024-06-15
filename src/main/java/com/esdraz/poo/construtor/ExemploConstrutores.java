package com.esdraz.poo.construtor;

public class ExemploConstrutores {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("francisco@gmail.com", "mudar@123");
        Usuario usuarioTelefone = new Usuario("558899999999");

        usuario.logar("jose@gmail.com", "meuacesso123");

        System.out.printf("Usuário: %s\nSenha: %s\n", usuario.email, usuario.senha);
        System.out.printf("Usuário: %s\n", usuarioTelefone);
    }
}
