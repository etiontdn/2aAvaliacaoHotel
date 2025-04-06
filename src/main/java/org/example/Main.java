package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Hotel: Três Estrelas");
        Hotel tresEstrelas = new Hotel("Três Estrelas", 190.0);

        System.out.println("Adicionando Hóspede João");
        Hospede joao = tresEstrelas.cadastrarHospede("João J", "123124123-44");
        Date dataInicio = FaixaHorario.transformarData("01/01/2025 12:00");
        Date dataFim = FaixaHorario.transformarData("08/01/2025 12:00");
        FaixaHorario faixa = new FaixaHorario(dataInicio, dataFim);

        System.out.println("Efetuando Reserva... ");
        Reserva r = tresEstrelas.efetuarReserva(joao, faixa);
        r.exibir();

        System.out.println("Dados do hóspede: ");
        joao.exibir();

        System.out.println("João entra no hotel no horário");
        joao.entrar(dataInicio);
        System.out.println("E sai novamente 3 horas depois");
        joao.sair(FaixaHorario.transformarData("01/01/2025 15:00"));

        System.out.println("Exibir dados: ");
        joao.exibir();

        System.out.println("Conta final: " + tresEstrelas.contaFinal(joao));


        tresEstrelas.cadastrarHospede("Carla", "123123123-55");
        tresEstrelas.cadastrarHospede("Isthefanny", "123123123-66");

        tresEstrelas.listarHospedes();
    }
}