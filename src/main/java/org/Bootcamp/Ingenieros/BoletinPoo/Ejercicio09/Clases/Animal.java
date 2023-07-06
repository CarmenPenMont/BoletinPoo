package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases;

public class Animal {
    public String reino;
    public String tipo;
    public String raza;
    public String medio;

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                '}';
    }

    public Animal(String reino, String tipo, String raza, String medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }

    public Animal(String reino, String tipo, String raza) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = "terrestre";
    }

}
