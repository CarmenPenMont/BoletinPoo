package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio12;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11.AnimalGranja;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio11.Mascota;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio09.Clases.Animal;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio12.AnimalSalvaje;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio12.Perro;
public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Mamífero", "perro", "Border Collie", "terrestre", "Eustaquio", "Llama");
        System.out.println(perro.raza);
        Oveja oveja = new Oveja("mamifero","ovino","merina","terrestre","Secun");
        System.out.println(oveja.getPropietario());
        Tucan tucan = new Tucan ("ave", "tucan", "tucan colorado", "aereo");
        System.out.println(tucan.reino);
    }
}
