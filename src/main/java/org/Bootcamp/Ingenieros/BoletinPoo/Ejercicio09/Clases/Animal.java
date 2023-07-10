package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases;

public class Animal {
    public String reino;
    public String tipo;
    public String raza;
    public String medio;
    public boolean es_un_clon = false;

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                ", es_un_clon=" + es_un_clon +
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
        this.es_un_clon = false;
    }

    public Animal(Animal other) {
        this.reino = other.reino;
        this.tipo = other.tipo;
        this.raza = other.raza;
        this.medio = other.medio;
        this.es_un_clon = true;
    }

    @Override
    public Animal clone() {
        Animal clon = new Animal (this.reino, this.tipo, this.raza, this.medio);
        clon.es_un_clon=true;
        return clon;
    }
}
