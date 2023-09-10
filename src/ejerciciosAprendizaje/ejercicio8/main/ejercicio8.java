package ejerciciosAprendizaje.ejercicio8.main;

import ejerciciosAprendizaje.ejercicio8.entities.Cadena;
import ejerciciosAprendizaje.ejercicio8.services.CadenaService;

import java.util.Scanner;


public class ejercicio8 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        CadenaService cs = new CadenaService();

        System.out.println("Ingrese frase");
        Cadena frase1 = new Cadena();

        frase1.setFrase(reader.nextLine());
        frase1.setLongFrase(frase1.getFrase().length());

        cs.mostrarVocales(frase1);
        cs.invertirFrase(frase1);
        cs.vecesRepetido(frase1);
        cs.compararLongitud(frase1);
        cs.unirFrases(frase1);
        cs.reemplazar(frase1);
        System.out.println(cs.contiene(frase1));

    }
}
