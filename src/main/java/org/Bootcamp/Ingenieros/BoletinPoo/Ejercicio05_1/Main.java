package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio05_1;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        double numero;
        System.out.print("Introduce un número Decimal: ");
        numero = Input.real();

        double decNum = numero % 1;
        double intNum = numero - decNum;

        System.out.print("La parte entera es ");
        System.out.println(intNum);
        System.out.print("La parte decimal es ");
        System.out.println(decNum);
    }
}