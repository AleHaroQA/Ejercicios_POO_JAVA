package ejerciciosAprendizaje.ejercicio12.main;

import ejerciciosAprendizaje.ejercicio12.entities.PersonaDate;
import ejerciciosAprendizaje.ejercicio12.services.PersonaDateService;

public class ejercicio12 {

    public static void main(String[] args) {

        PersonaDateService pds = new PersonaDateService();

        PersonaDate pd1 = pds.crearPersona();
        pds.calcularEdad(pd1);
        System.out.println("");
        System.out.println(pds.mostrarPersona(pd1));
        System.out.println(pds.menorQue(pd1));
    }
}

