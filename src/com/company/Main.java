package com.company;

public class Main {
    public static void main(String[] args) {

        Gerente edson = new Gerente();
        edson.setNome("Edson de Araujo Corral");
        edson.setCpf("066.202.869-41");
        edson.setSalario(5000.00);
        edson.setSenha(121412);

        boolean autentidaco = edson.autentica(121412);
        if(autentidaco == true) {
            System.out.println("Voce esta autenticado");
        } else {
            System.out.println("Voce nao esta autenticado");
        }

        System.out.println("Nome - " + edson.getNome());
        System.out.println("CPF - " + edson.getCpf());
        System.out.println("Salario R$: " + edson.getSalario());
    }
}
