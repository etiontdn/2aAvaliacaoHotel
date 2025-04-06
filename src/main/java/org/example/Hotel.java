package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nomeHotel;
    // Relação de composição com hóspedes, um hotel precisa de hóspedes para existir, e todos que estão
    // nele são removidos com o hotel, ou seja, não existem sem o hotel.
    private List<Hospede> hospedes = new ArrayList<>();

    // Relação de composição com reservas, um hotel precisa de reservas para existir, e todas que estão
    // nele são removidos com o hotel
    private List<Reserva> reservas = new ArrayList<>();


    // a inicialização de hóspedes e reservas é feita dentro do objeto hotel, e não fora
    // dessa forma se o hotel deixar de existir seus hóspedes e reservas também irão.
    public Hotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public Reserva efetuarReserva(Hospede hospede, FaixaHorario faixa) {
        Reserva reserva = new Reserva(hospede, faixa) ;
        reservas.add(reserva);
        return reserva;
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public Hospede cadastrarHospede(String nome, String cpf) {
        Hospede hospede = new Hospede(nome, cpf);
        hospedes.add(hospede);
        return hospede;
    }

    public void removerHospede(Hospede hospede) {
        hospedes.remove(hospede);
    }
}
