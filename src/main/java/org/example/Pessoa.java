package org.example;

public abstract class Pessoa {
    String nome;
    String cpf;

    public Pessoa() {
        return;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
