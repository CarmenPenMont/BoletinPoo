package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class Tucan extends Animal implements ISexual{

    String sexo;
    public Tucan(String reino, String tipo, String raza, String medio, String sexo) {
        super(reino, tipo, raza, medio);
        this.sexo = sexo;
    }

    @Override
    void repSonido() {
        System.out.println(" y hace tuc tuc");
    }

    @Override
    void desplazarse() {
        System.out.print("El tucan vuela");
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;

    }
}
