package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio05;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main {
    public static void main(String[] args) {
        double numero;
        System.out.print("Introduce un número Decimal: ");
        numero= Input.real();

        String str = String.valueOf(numero);
        int intNum= Integer.parseInt(str.substring(0,str.indexOf(".")));
        double decNum=Float.parseFloat(str.substring(str.indexOf(".")));

        System.out.print("La parte entera es " );
        System.out.println(intNum);
        System.out.print("La parte decimal es ");
        System.out.println(decNum);
    }
}
