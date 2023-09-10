package ejerciciosAprendizaje.ejercicio9.main;

import ejerciciosAprendizaje.ejercicio9.entities.Matematica;
import ejerciciosAprendizaje.ejercicio9.services.MatematicaService;

public class ejercicio9 {

    public static void main(String[] args) {

         /* En el main se creará el objeto y se usará el
        Math.random para generar los dos números y se guardaran en el objeto con su
        respectivos set. */

        MatematicaService ms = new MatematicaService();
        Matematica mate = new Matematica(Math.random()*10+1, Math.random()*10+1);
        System.out.println(mate.getNum1());
        System.out.println(mate.getNum2());
        ms.devolverMayor(mate);
        ms.calcularPotencia(mate);
        ms.calcularRaiz(mate);

    }
}
