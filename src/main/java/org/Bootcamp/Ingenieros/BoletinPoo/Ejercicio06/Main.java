package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio06;

public class Main {

    public static void main(String[] args) {
        int f_0 = 0;
        int f_1 = 1;
        int f_suma = 1;
        System.out.println(f_1);
        for (int i=1; i<15;i++){
            f_suma = f_0 + f_1;
            f_0 = f_1;
            f_1 = f_suma;
            System.out.println(f_suma);
        }
    }
}
