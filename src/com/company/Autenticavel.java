package com.company;

/* Uma interface e uma classe abstrata com todos os seus metodos abstratos */
public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);
}
