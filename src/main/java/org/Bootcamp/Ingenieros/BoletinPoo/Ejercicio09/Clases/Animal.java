package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases;

public class Animal {
    public String reino;
    public String tipo;
    public String raza;
    public String medio;
    public Boolean es_un_clon;

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
    }
    public Animal (Animal other){
        this.reino = other.reino;
        this.tipo = other.tipo;
        this.raza = other.raza;
        this.medio = other.medio;


    }

}
