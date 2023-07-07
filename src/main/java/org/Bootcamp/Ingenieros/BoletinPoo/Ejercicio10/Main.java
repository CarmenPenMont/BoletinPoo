package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio10;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;

public class Main {

    public static void main(String[] args) {
        Animal a;
        a = new Animal("mamifero", "perro", "caniche", "terrestre");
        Animal clon = new Animal(a);
        Animal clon_2 = a.clone();

        System.out.println(a);
        System.out.println(clon);
        System.out.println(clon_2);


    }

}
