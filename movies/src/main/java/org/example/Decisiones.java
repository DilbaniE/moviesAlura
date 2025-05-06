package org.example;

public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2020;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 1.5;
        String tipoPlan = "Premio";

        if(fechaDeLanzamiento >= 2020){
            System.out.println("Peliculas mas recientes");
        }else{
            System.out.println("Peliculas mas retro");
        }

        if(incluidoEnElPlan && tipoPlan.equals("Premio")){
            System.out.println("Disfruta la pelicula");
        }else{
            System.out.println("Pelicula no disponible");
        }
    }
}
