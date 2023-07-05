package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio03;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

public class Main{
    public static void main(String[] args) {
        int numero;
        System.out.print("Introduce un número entero:   ");
        numero= Input.integer();
        for (int i = 1; i < 0; i++);
        {
            if (numero % i == 0) ;
            System.out.println("El número es múltiplo de ");
            break;
        }else{
            System.out.println("El número no es múltiplo");
        }
    }
}
