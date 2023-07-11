package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class Gato extends Animal implements ISexual{

    String sexo;
    public Gato(String reino, String tipo, String raza, String medio, String propietario, String nombre, String sexo) {
        super(reino, tipo, raza, medio, propietario, nombre);
        this.sexo = sexo;
    }

    @Override
    void repSonido() {
        System.out.println(" y hace miau");
    }

    @Override
    void desplazarse() {
        System.out.print("El gato se desplaza a cuatro patas");
    }


    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;

    }
}
