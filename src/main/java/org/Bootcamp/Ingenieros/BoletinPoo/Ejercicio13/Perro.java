package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;

public class Perro extends Animal implements ISexual {

    String sexo;

    public Perro(String reino, String tipo, String raza, String medio, String propietario, String nombre, String sexo) {
        super(reino, tipo, raza, medio, propietario, nombre);
        this.sexo = sexo;
    }


    @Override
    void repSonido() {
        System.out.println(" y hace guau guau");
    }

    @Override
    void desplazarse() {
        System.out.print("El perro se desplaza a cuatra patas");
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
