package org.example;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");

        int fechaDeLanzamiento = 2020;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 1.5;
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println("media: " + media);
        String text = """
                Matriz es la mejor pelicula de todos los tiempos,
                su trama te deja atrapado en la pantalla
                haciendote alucinar.
                """ + fechaDeLanzamiento;
        System.out.println(text);

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));
        int clasificacion = (int) media / 2;
        System.out.println(clasificacion);
     }
    }