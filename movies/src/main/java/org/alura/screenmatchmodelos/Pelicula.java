package org.alura.screenmatchmodelos;

import org.alura.calcularTiempo.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "PELICULA " + this.getTitulo() + " ( " + getFechaDeLanzamiiento() +" )";
    }
}
