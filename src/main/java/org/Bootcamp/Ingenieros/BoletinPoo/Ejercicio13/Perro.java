package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;

public class Perro extends Animal {


    public Perro(String reino, String tipo, String raza, String medio, String propietario, String nombre) {
        super(reino, tipo, raza, medio, propietario, nombre);
    }


    @Override
    void repSonido() {
        System.out.println(" y hace guau guau");
    }

    @Override
    void desplazarse() {
        System.out.print("El perro se desplaza a cuatra patas");
    }
}
