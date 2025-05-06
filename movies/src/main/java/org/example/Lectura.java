package org.example;

import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclaso = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula");
        String nombre = teclaso.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaLanzamiento = teclaso.nextInt();
        System.out.println("Escribe la reseña que le das a la pelicula");
        String resena = teclaso.nextLine();
        System.out.println("Escribe la valoracion de la pelicula");
        double valoracion = teclaso.nextDouble();

        System.out.println(nombre);
        System.out.println(fechaLanzamiento);
        System.out.println(resena);
        System.out.println(valoracion);


    }
}
