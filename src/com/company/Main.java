package com.company;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 223234);

        Cliente primeiroCliente = new Cliente();
        primeiroCliente.nome = "Edson";
        primeiroCliente.cpf = "066.202.8690-41";
        primeiroCliente.profissao = "Desenvolvedor de Software";

        conta.setTitular(primeiroCliente);
        System.out.println("Agencia - " + conta.getAgencia() + " Numero - " + conta.getNumero());
        System.out.println("Titular - " + primeiroCliente.nome + " CPF - " + primeiroCliente.cpf);

        conta.deposita(103.00);

        System.out.println("SALDO R$:" + conta.getSaldo());

    }
}
