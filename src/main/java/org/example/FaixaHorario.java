package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FaixaHorario implements Informativo {
    private Date inicio;
    private Date fim;

    public FaixaHorario(Date inicio, Date fim) {
        this.inicio = inicio;
        this.fim = fim;
    }


    // Implementação de métodos estáticos para facilitar o uso de datas.
    public static String transformarLegivel(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(data);
    }

    public static Date transformarData(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return sdf.parse(data);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void exibir() {
        System.out.print(FaixaHorario.transformarLegivel(inicio));
        System.out.println(" até " + FaixaHorario.transformarLegivel(fim));
    }
}
