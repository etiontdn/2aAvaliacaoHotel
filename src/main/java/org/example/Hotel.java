package org.example;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Hotel {
    private String nomeHotel;
    private double diaria;
    // Relação de composição com hóspedes, um hotel precisa de hóspedes para existir, e todos que estão
    // nele são removidos com o hotel, ou seja, não existem sem o hotel.
    private List<Hospede> hospedes = new ArrayList<>();

    // Relação de composição com reservas, um hotel precisa de reservas para existir, e todas que estão
    // nele são removidos com o hotel
    private List<Reserva> reservas = new ArrayList<>();


    // a inicialização de hóspedes e reservas é feita dentro do objeto hotel, e não fora
    // dessa forma se o hotel deixar de existir seus hóspedes e reservas também irão.
    public Hotel(String nomeHotel, double diaria) {
        this.nomeHotel = nomeHotel;
        this.diaria = diaria;
    }

    public Reserva efetuarReserva(Hospede hospede, FaixaHorario faixa) {
        Reserva reserva = new Reserva(hospede, faixa) ;
        reservas.add(reserva);
        return reserva;
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.getHospede().removerReserva(reserva);
    }

    public Hospede cadastrarHospede(String nome, String cpf) {
        Hospede hospede = new Hospede(nome, cpf);
        hospedes.add(hospede);
        return hospede;
    }

    public void removerHospede(Hospede hospede) {
        hospedes.remove(hospede);
    }

    public double contaFinal(Hospede hospede) {
        List<Reserva> reservas = hospede.getReservas();
        double conta = 0.0;
        for (Reserva r : reservas) {
            Date inicio = r.getFaixa().getInicio();
            Date fim = r.getFaixa().getFim();

            // transforma diferença em dias para contar a diária.
            long diferenca = fim.getTime() - inicio.getTime();
            diferenca = diferenca/(1000*60*60*24);
            conta += diaria*diferenca;
        }
        return conta;
    }

    public void listarHospedes() {
        System.out.println("Hóspedes: ");
        for (Hospede h : hospedes) {
            System.out.println(h.getNome());
        }
    }
}
