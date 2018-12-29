package com.company;


public class ClienteEmpresa implements Autenticavel {
   private AutenticacaoUtil util;

   public ClienteEmpresa() {
       this.util = new AutenticacaoUtil();
   }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.util.autentica(senha); //delegar a chamada
    }
}
