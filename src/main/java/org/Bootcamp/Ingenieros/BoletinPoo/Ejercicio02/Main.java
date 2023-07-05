package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio02;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        boolean primo;
        int numero;
        int resto;
        System.out.print("Introduce un número entero: ");
        numero = Input.integer();
        int[] intArrayPrimo = new int[5];
        intArrayPrimo[0] = 1;
        intArrayPrimo[1] = 2;
        intArrayPrimo[2] = 3;
        intArrayPrimo[3] = 5;
        intArrayPrimo[4] = 7;
        for (int i = 0; i < intArrayPrimo.length; i++) {
            if (numero % intArrayPrimo[i] == 0) {
                primo = true;
                System.out.println("El número es múltiplo de: ");
                System.out.println(intArrayPrimo [i]);
            } else {
                primo = false;
                System.out.println("El número no es múltiplo");
            }
        }
    }
}
