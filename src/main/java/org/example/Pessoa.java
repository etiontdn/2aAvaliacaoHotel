package org.example;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa() {
        return;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
