package com.company;

public class Main {
    public static void main(String[] args) {

        Autenticavel gerente = new Gerente();
        gerente.setSenha(222);
        Autenticavel adm = new Administrador();
        adm.setSenha(222);
        Autenticavel cliente = new ClienteEmpresa();
        cliente.setSenha(222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(adm);
        si.autentica(cliente);
    }
}
