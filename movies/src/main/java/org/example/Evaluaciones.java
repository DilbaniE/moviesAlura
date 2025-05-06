package org.example;

import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le daras a la pelicula Matriz");
            nota = sc.nextDouble();
            if (nota != -1 ) {
                media += nota;
                total++;
            }
            System.out.println("la nota es " + media);

        }
        System.out.println("la media de evaluacion para Matriz es: " + media / total);

    }
}

