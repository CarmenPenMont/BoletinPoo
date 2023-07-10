package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class Vaca extends Animal{
    public Vaca(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    @Override
    void repSonido() {
        System.out.println(" y hace muuuu");
    }

    @Override
    void desplazarse() {
        System.out.print("La vaca se desplaza a cuatro patas");
    }
}
