package org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13;
import org.Bootcamp.Ingenieros.BoletinPoo.Ejercicio13.Animal;
public class PezPayaso extends Animal implements ISexual{

    String sexo;
    public PezPayaso(String reino, String tipo, String raza, String medio, String sexo) {

        super(reino, tipo, raza, medio);
        this.sexo = sexo;
    }

    @Override
    void repSonido() {
        System.out.println(" y hace glup");
    }

    @Override
    void desplazarse() {
        System.out.print("El pez payaso se desplaza nadando");
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
