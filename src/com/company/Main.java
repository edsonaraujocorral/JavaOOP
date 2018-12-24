package com.company;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Edson");
        g1.setSalario(2000);

        Funcionario f = new Funcionario();
        f.setSalario(1500);

        EditorVideo editor = new EditorVideo();
        editor.setSalario(2100);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(editor);

        System.out.println(controle.getSoma());
    }
}
