package org.alura;

import org.alura.calcularTiempo.CalcularTiempo;
import org.alura.calcularTiempo.FiltroRecomendaciones;
import org.alura.screenmatchmodelos.Episodio;
import org.alura.screenmatchmodelos.Pelicula;
import org.alura.screenmatchmodelos.Serie;

import java.util.ArrayList;

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
    System.out.println(peli.calculaMedia());

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

    FiltroRecomendaciones filtro = new FiltroRecomendaciones();
    filtro.filtra(peli);

    Episodio episodio = new Episodio();
    episodio.setNumero(4);
    episodio.setNombre("Game of Thrones");
    episodio.setSerie(serie);
    episodio.setTotalVisualizaciones(50);

    FiltroRecomendaciones.filtra(episodio);

    var  peliculaDeDilbani = new Pelicula();
    peliculaDeDilbani.setTitulo("Dori");
    peliculaDeDilbani.setFechaDeLanzamiiento(2008);
    peliculaDeDilbani.setDuracion(120);

    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    listaPeliculas.add(peli);
    listaPeliculas.add(movie);
    listaPeliculas.add(peliculaDeDilbani);

    System.out.println("Tamaño de la lista" + listaPeliculas.size());
    System.out.println("La primera pelicula es: " + listaPeliculas.get(0).getTitulo());

    System.out.println(listaPeliculas.toString());

    System.out.println("toString de la pelicula es: " + listaPeliculas.get(0).toString());




}
}
