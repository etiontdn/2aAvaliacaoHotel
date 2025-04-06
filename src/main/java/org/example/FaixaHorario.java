package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FaixaHorario implements Informativo {
    Date inicio;
    Date fim;

    public FaixaHorario(Date inicio, Date fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public static String transformarLegivel(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(date);
    }

    public void exibir() {
        System.out.print(FaixaHorario.transformarLegivel(inicio));
        System.out.println(" até " + FaixaHorario.transformarLegivel(fim));
    }
}
