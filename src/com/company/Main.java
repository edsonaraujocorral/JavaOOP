package com.company;

public class Main {
    public static void main(String[] args) {
        Funcionario edson = new Funcionario();
        edson.setNome("Edson");
        edson.setCpf("066.202.869-41");
        edson.setSalario(2500.00);
        edson.setTipo(2);

        System.out.println("Nome - " + edson.getNome());
        System.out.println("CPF - " + edson.getCpf());
        System.out.println("Salario - R$: " + edson.getSalario());
        System.out.println("Bonificacao - R$: " + edson.getBonificacao());
    }
}
