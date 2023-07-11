package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;

public class Vaca extends Animal implements ISexual {

    String sexo;

    public Vaca(String reino, String tipo, String raza, String medio, String propietario,String sexo) {
        super(reino, tipo, raza, medio, propietario);
        this.sexo = sexo;
    }

    @Override
    void repSonido() {
        System.out.println(" y hace muuuu");
    }

    @Override
    void desplazarse() {
        System.out.print("La vaca se desplaza a cuatro patas");
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
