package org.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le daras a la pelicula");
            nota = sc.nextDouble();
            media = (nota + nota + nota) / 3;
            System.out.println("la nota es" + media);

        }
        System.out.println("la nota es" + media);
    }
}
