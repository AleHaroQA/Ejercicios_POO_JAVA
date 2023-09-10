package ejerciciosAprendizaje.ejercicio14.services;

import constantes.Constantes;
import ejerciciosAprendizaje.ejercicio14.entities.Movil;

import java.util.Scanner;

public class MovilService {

    Scanner reader = new Scanner(System.in);
    /*
    Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
    instanciar un objeto Celular y poder cargarlo en nuestro programa. */

    public Movil cargarCelular(){
        Movil m = new Movil();

        System.out.println("Ingrese marca: ");
        String marca = reader.nextLine();
        System.out.println("Ingrese precio:");
        int precio = reader.nextInt();
        System.out.println("Ingrese modelo:");
        String modelo = reader.next();
        System.out.println("Ingrese memoria Ram:");
        int memoriaRam = reader.nextInt();
        System.out.println("Ingrese almacenamiento:");
        int almacenamiento = reader.nextInt();
        
        return new Movil(marca,precio,modelo,memoriaRam,almacenamiento, ingresarCodigo());
    }

    /* Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
    números de un celular. Para ello, puede utilizarse un bucle repetitivo
     */

    public int[] ingresarCodigo(){
        int codigo[] = new int[Constantes.DIGITOS_CODIGO];

        for (int i = 0; i < Constantes.DIGITOS_CODIGO; i++) {

            codigo[i] = (int) (Math.random()*10) +1;
        }
        return codigo;
    }
}
