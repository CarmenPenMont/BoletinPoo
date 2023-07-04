package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio01;


import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        int numero;
        System.out.print("Introduce un número entero:   ");
        numero= Input.integer();
        if (numero % 2 == 0){
            System.out.println("ES PAR");
        } else {
            System.out.println("ES IMPAR");
        }
    }
}