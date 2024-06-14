package com.esdraz.poo;

public class ExemplosMetodosRetornos {

    public static void main(String[] args) {
        Funcionario francisco = new Funcionario();
        francisco.salario = 23000.00;
        double salarioComBonus = francisco.calcularSalarioComDescontoRetorno(1500);
//        francisco.calcularSalarioComDescontoSemRetorno();

        System.out.println("Salário com bonus: " + salarioComBonus);

    }
}

class Funcionario {
    //atributo
    double salario = 0;

    //método sem retorno
    void calcularSalarioComDescontoSemRetorno() {
        double totalComDesconto = salario - (salario * 0.10);
        System.out.printf("Valor do salário com desconto: %s", totalComDesconto);
    }

    //método com retorno
    double calcularSalarioComDescontoRetorno(double bonus) {
        double totalComDesconto = salario - (salario * 0.10) + bonus;
        return totalComDesconto;
    }
}
