package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Main;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;

public class Main {

    public static void main(String[] args) {
        Animal perro = new Animal("mamifero", "perro", "salchicha");
        System.out.println(perro.raza);
        System.out.println(perro.toString());
        System.out.println(perro.reino);
    }
}
