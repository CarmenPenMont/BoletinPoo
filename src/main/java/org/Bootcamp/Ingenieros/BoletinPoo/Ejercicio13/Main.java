package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Perro;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("mamifero", "perro", "pastor aleman", "terrestre", "Antonio", "Budy", "macho");
        perro.desplazarse();
        perro.repSonido();

        Tucan tucan = new Tucan("ave", "tucan", "bicolor", "aereo", "macho");
        tucan.desplazarse();
        tucan.repSonido();

        Gato gato = new Gato("mamifero", "gato", "siberiano", "terrestre", "Demetrio", "Soldado", "macho");
        gato.desplazarse();
        gato.repSonido();

        PezPayaso pez = new PezPayaso("peces", "pez", "payaso", "acuatico","hembra");
        pez.desplazarse();
        pez.repSonido();

        Vaca vaca = new Vaca("mamifero", "vaca", "pinta", "terrestre", "Eufrasio","hembra");
        vaca.desplazarse();
        vaca.repSonido();

        Oveja oveja = new Oveja ("mamifero", "oveja","castellana", "terrestre", "Nicoleto","hembra");
        oveja.desplazarse();
        oveja.repSonido();


    }

}
