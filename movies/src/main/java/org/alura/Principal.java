package org.alura;

import org.alura.calcularTiempo.CalcularTiempo;
import org.alura.screenmatch.Pelicula;
import org.alura.screenmatch.Serie;

public class Principal {
    public static void main(String[] args) {

    Pelicula peli = new Pelicula();
    peli.setTitulo("Rick y morty");
    peli.setFechaDeLanzamiiento(1999);
    peli.setIncluidoEnElPlan(true);
    peli.setDuracion(120);

    peli.muestraFichaTecnica();
    peli.evalua(10);
    peli.evalua(20);
    peli.evalua(30);
    System.out.println(peli.getTotalEvaluaciones());
    System.out.println(peli.cacalaMedia());

    Pelicula movie = new Pelicula();
    movie.setTitulo("Dori");
    movie.setFechaDeLanzamiiento(2001);
    movie.setDuracion(120);

    Serie serie = new Serie();
    serie.setTitulo("Game of Thrones");
    serie.setFechaDeLanzamiiento(2000);
    serie.setTemporada(1);
    serie.setMintPorEpisodio(50);
    serie.setEpisodios(10);
    serie.muestraFichaTecnica();
    System.out.println(serie.getDuracionEnMinutos());

    CalcularTiempo calculadora = new CalcularTiempo();
    calculadora.incluye(peli);
    calculadora.incluye(serie);
    calculadora.incluye(movie);
    System.out.println("Tiempo necesario para ver tus pelis favoritas" + calculadora.getTiempoTotal());

}
}
