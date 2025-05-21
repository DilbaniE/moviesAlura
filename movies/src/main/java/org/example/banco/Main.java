package org.example.banco;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        String nombre = "Tony Tester";
        String cuenta = "Corriente";
        double valor = 256888;

        System.out.println( "El nombre es: " + nombre);
        System.out.println("El numero de cuenta es:" + cuenta);
        System.out.println("El valor en la cuenta: " + valor);

        String menu = """
                Elija la opcion que desea
                
                1. Concultar Saldo
                2.  Retirar Saldo
                3.  Depositar Saldo
                9.  Salir
                                
                """;
        Scanner sc = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = sc.nextInt();
           switch (opcion) {
               case 1:
                   System.out.println("El saldo es: " + valor);
                   break;
               case 2:
                   System.out.println("El saldo  a retirar es: " );
                   double saldoRetirada = sc.nextDouble();
                   if (saldoRetirada > valor) {
                       System.out.println("No se puede retirar el valor " + valor );
                   }else{
                       valor = valor - saldoRetirada;
                       System.out.println("Su retiro fue exitoso " + valor);
                   }
                   break;
               case 3:
                   System.out.println("El saldo  a depositar es: " + cuenta);
                    double saldoDepositar = sc.nextDouble();
                    valor += saldoDepositar;
                    System.out.println("Su deposito fue exitoso " + valor);
                   break;
                   case 9:
                       System.out.println(" Saliendo");
                       break;
               default:
                   System.out.println("Opcion no valida");
           }
        }
    }
}
