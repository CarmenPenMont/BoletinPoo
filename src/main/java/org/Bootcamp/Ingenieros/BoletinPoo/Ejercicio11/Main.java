package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11.Mascota;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11.AnimalGranja;

public class Main {

    public static void main(String[] args) {

        Mascota perro = new Mascota("mamifero", "perro", "chihuahua", "terrestre", "Eladio", "Firulais");
        AnimalGranja gallina = new AnimalGranja("ave", "gallina", "gallina de Mos ", "aéreo", "Dolores");
        System.out.println(perro.nombre);
        System.out.println(gallina.propietario);


    }
}
