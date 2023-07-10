package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class PezPayaso extends Animal{
    public PezPayaso(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    @Override
    void repSonido() {
        System.out.println(" y hace glup");
    }

    @Override
    void desplazarse() {
        System.out.print("El pez payaso se desplaza nadando");
    }
}
