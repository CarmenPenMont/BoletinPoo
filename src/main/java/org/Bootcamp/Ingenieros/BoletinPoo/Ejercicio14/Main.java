package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio14;

import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

        ArrayList<String> lista = new ArrayList<String>();

        Perro perroM = new Perro("mamifero","perro","pomeranian", "terrestre","Adolfito", "Pacheco","Macho");
        Perro perroH = new Perro("mamifero","perro","husky","terrestre", "Petra","Milu","Hembra");
        Gato gatoM = new Gato("mamifero","gato","Maine Coon","terrestre","Carmen","Titines","Macho");
        Gato gatoH = new Gato("mamifero","gato","Sphynx","terrestre","Sito","Peludito","Hembra");
        Oveja carneroM = new Oveja ("mamifero","oveja","manchega","terrestre","Servando","Macho");
        Oveja ovejaH = new Oveja ("mamifero", "oveja","churra","terrstre","Antonia","Hembra");
        PezPayaso pezM = new PezPayaso("peces","pez","payaso","acuatico","Macho");
        PezPayaso pezH = new PezPayaso("peces","pez","payaso","acuatico","Hembra");
        Tucan tucanM = new Tucan("ave","tucan","Chocó","aereo","Macho");
        Tucan tucanH = new Tucan("ave","tucan","pico acanalado","aereo","Hembra");
        Vaca toroM = new Vaca("mamifero","toro","Lidia","terrestre","Chesu","Macho");
        Vaca vacaH = new Vaca("mamifero","vaca","rubia","terrestre","Paco","Hembra");

        lista.add(String.valueOf(perroM));
        lista.add(String.valueOf(perroM));
        lista.add(String.valueOf(gatoM));
        lista.add(String.valueOf(gatoH));
        lista.add(String.valueOf(carneroM));
        lista.add(String.valueOf(ovejaH));
        lista.add(String.valueOf(pezM));
        lista.add(String.valueOf(pezM));
        lista.add(String.valueOf(tucanM));
        lista.add(String.valueOf(tucanH));
        lista.add(String.valueOf(toroM));
        lista.add(String.valueOf(vacaH));


        for (int i=0;i < lista.size();i++) {
            System.out.println(lista.get(i));
        }
    }
}
