package org.example;

public class Pelicula {
        String titulo;
       int fechaDeLanzamiiento;
       int duracion;
       boolean incluEnElPlan;
       double sumaEvaluaciones;
       int totalEvaluaciones;

       void muestraFichaTecnica(){
           System.out.println("nombre de la pelicula" + titulo);
           System.out.println("fecha de lanzamiento" + fechaDeLanzamiiento);
           System.out.println("Duracion  de la pelicula" + duracion);

       }

       void evalua(double nota){
           sumaEvaluaciones += nota;
           totalEvaluaciones ++;
       }

       double cacalaMedia(){
           return sumaEvaluaciones/totalEvaluaciones;
       }
    }
