package org.alura.calcularTiempo;


import org.alura.screenmatch.Titulo;

public class CalcularTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracion();
    }
}
