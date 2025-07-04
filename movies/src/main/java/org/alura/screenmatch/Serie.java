package org.alura.screenmatch;

public class Serie extends Titulo{
    private int temporada;
    private int episodios;
    private int mintPorEpisodio;

    public int getDuracionEnMinutos(){
        return temporada * episodios * mintPorEpisodio;
    }
    public void muestraFichaTecnica() {}

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getMintPorEpisodio() {
        return mintPorEpisodio;
    }

    public void setMintPorEpisodio(int mintPorEpisodio) {
        this.mintPorEpisodio = mintPorEpisodio;
    }
}
