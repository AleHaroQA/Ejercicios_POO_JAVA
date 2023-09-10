package ejerciciosAprendizaje.ejercicio14.main;

import ejerciciosAprendizaje.ejercicio14.entities.Movil;
import ejerciciosAprendizaje.ejercicio14.services.MovilService;

public class ejercicio14 {

    public static void main(String[] args) {

        MovilService ms = new MovilService();
        Movil movil = ms.cargarCelular();
        System.out.println(movil.toString());
    }
}
