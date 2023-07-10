package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio12;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11.IPropietario;

public class AnimalSalvaje extends Animal implements IPropietario {

    String propietario;

    public AnimalSalvaje(String reino, String tipo, String raza, String medio, String propietario) {
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

