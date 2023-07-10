package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class Tucan extends Animal {


    public Tucan(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    @Override
    void repSonido() {
        System.out.println(" y hace tuc tuc");
    }

    @Override
    void desplazarse() {
        System.out.print("El tucan vuela");
    }
}
