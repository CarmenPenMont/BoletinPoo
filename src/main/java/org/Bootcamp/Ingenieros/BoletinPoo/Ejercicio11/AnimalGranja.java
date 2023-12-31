package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;

public class AnimalGranja extends Animal implements IPropietario {

    String propietario;

    public AnimalGranja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario = propietario;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}

