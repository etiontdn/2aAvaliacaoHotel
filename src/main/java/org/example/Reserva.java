package org.example;

public class Reserva implements Informativo{
    // Relação de associação com Hóspede
    private Hospede hospede;
    // Relação de agregação com faixa (ele existe fora da Reserva também)
    private FaixaHorario faixa;

    public Reserva(Hospede hospede, FaixaHorario faixa) {
        this.hospede = hospede;
        hospede.adicionarReserva(this);
        this.faixa = faixa;
    }

    public void exibir() {
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("Reserva:");
        faixa.exibir();
    }

    public FaixaHorario getFaixa() {
        return faixa;
    }

    public Hospede getHospede() {
        return hospede;
    }
}
