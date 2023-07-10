package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class Gato extends Animal{

    public Gato(String reino, String tipo, String raza, String medio, String propietario, String nombre) {
        super(reino, tipo, raza, medio, propietario, nombre);
    }

    @Override
    void repSonido() {
        System.out.println(" y hace miau");
    }

    @Override
    void desplazarse() {
        System.out.print("El gato se desplaza a cuatro patas");
    }
}
