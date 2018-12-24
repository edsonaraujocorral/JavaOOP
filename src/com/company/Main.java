package com.company;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Edson");
        g1.setSalario(2000);

        Funcionario f = new Funcionario();
        f.setSalario(1500);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);

        System.out.println(controle.getSoma());
    }
}
