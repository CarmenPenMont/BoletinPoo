package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;

public class Mascota extends Animal implements IPropietario {


    String propietario, nombre;

    public Mascota(String reino, String tipo, String raza, String medio, String propietario, String nombre) {
        super(reino, tipo, raza, medio);
        this.propietario = propietario;
        this.nombre = nombre;
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
