package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Relação de Especialização de Pessoa
public class Hospede extends Pessoa implements Informativo {
    List<Date> entradas = new ArrayList<>();
    List<Date> saidas = new ArrayList<>();

    public Hospede(String nome, String cpf) {
        super(nome, cpf);
    }

    public void entrar(Date horas) {
        entradas.add(horas);
    }

    public void sair(Date horas) {
        saidas.add(horas);
    }

    public void exibir() {
        System.out.println(nome + " - " + cpf);
        System.out.println("Ultima entrada: ");
        System.out.println("Ultima saída: ");
    }
}
