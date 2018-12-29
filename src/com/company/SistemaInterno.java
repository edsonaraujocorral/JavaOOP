package com.company;

public class SistemaInterno {
    private int senha = 222;

    public void autentica(FuncionarioAutenticavel g) {
        boolean autenticou = g.autenticou(this.senha);

        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Nao pode entrar no sistema!");
        }
    }
}
