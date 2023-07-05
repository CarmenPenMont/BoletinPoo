package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio05_2;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        double numero;
        System.out.print("Introduce un número Decimal: ");
        numero = Input.real();

        String str = String.valueOf(numero);
        String[] splited = str.split("\\.");
        String intNum = splited[0];
        String decNum = splited[1];

        System.out.println("La parte entera es " + String.valueOf(intNum));
        System.out.print("La parte decimal es " + String.valueOf("0." + decNum));
    }
}
