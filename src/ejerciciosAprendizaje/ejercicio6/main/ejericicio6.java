package ejerciciosAprendizaje.ejercicio6.main;

import ejerciciosAprendizaje.ejercicio6.entities.Cafetera;

import java.util.Scanner;

public class ejericicio6 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Cafetera nespresso = new Cafetera();
        int tazaVacia, cantidadCafe;

        nespresso.llenarCafetera();
        System.out.println("Ingrese tamaño taza vacía a rellenar:");
        tazaVacia = reader.nextInt();
        nespresso.servirTaza(tazaVacia);
        nespresso.vaciarCafetera();
        System.out.println("Ingrese cantidad de café para rellenar cafetera:");
        cantidadCafe = reader.nextInt();
        nespresso.agregarCafe(cantidadCafe);
    }
}
