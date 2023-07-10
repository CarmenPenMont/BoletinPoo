package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio08;

import org.Bootcamp.Ingenieros.BoletinPoo.Util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char opcion;
        int numero;
        int suma = 0;
        Character a, s, d, x;
        List<Integer> lista = new ArrayList<Integer>();
        opcion = Input.character("Introduce una opcion entre: a (añadir numero a la lista), s (sumar los elementos de la lista y d(eliminar el último elemento de la lista: ");

        while (opcion != 'x') {
            if (opcion == 'a') {
                System.out.println("Introduce un número entero: ");
                numero = Input.integer();
                lista.add(numero);
                System.out.println("La Lista es: " + lista);
                continue;
            } else {
                if (opcion == 's') {
                    System.out.print("La lista es: " + lista);
                    for (int i = 0; i < lista.size(); i++) {
                        suma = suma + lista.size();
                        System.out.println("y su suma es " + suma);
                        break;
                    }
                } else {
                    if (opcion == 'd') {
                        System.out.println("La lista original es: " + lista);
                        lista.remove(1);
                        System.out.println("La lista es: " + lista);
                        break;
                    }
                }
            }
        }
    }
}