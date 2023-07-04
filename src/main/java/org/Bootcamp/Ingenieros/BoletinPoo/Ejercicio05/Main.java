package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio05;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        double numero;
        System.out.print("Introduce un numero Decimal:   ");
        numero= Input.real();

        String str = String.valueOf(numero);
        int intNum= Integer.parseInt(str.substring(0,str.indexOf(".")));
        double decNum=Float.parseFloat(str.substring(str.indexOf(".")));

        System.out.println(intNum);
        System.out.println(decNum);
    }
}
