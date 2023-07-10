package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class Oveja extends Animal{
    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    @Override
    void repSonido() {
        System.out.println(" y hace beeee");
    }

    @Override
    void desplazarse() {
        System.out.print("La oveja se desplaza a cuatro patas");
    }
}
