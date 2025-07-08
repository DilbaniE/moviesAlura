package org.alura.screenmatchmodelos;

public class Titulo {
    private String titulo;
    private int fechaDeLanzamiiento;
    private int duracion;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaDeLanzamiiento(int fechaDeLanzamiiento) {
        this.fechaDeLanzamiiento = fechaDeLanzamiiento;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setIncluidoEnElPlan(boolean incluEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setSumaEvaluaciones(double sumaEvaluaciones) {
        this.sumaEvaluaciones = sumaEvaluaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("nombre de la pelicula" + titulo);
        System.out.println("fecha de lanzamiento" + fechaDeLanzamiiento);
        System.out.println("Duracion  de la pelicula" + duracion);

    }


    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }
}
