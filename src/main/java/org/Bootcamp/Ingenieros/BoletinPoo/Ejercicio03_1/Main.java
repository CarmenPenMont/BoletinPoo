package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio03_1;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        int numero;
        System.out.print("Introduce un número entero:  ");
        numero = Input.integer();
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.print("El número ");
                System.out.print(numero);
                System.out.print(" no es primo");
                break;
            } else {
                System.out.print("El número ");
                System.out.print(numero);
                System.out.print(" es primo");
                break;
            }
        }
    }
}

