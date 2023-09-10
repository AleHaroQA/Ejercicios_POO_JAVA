package ejerciciosAprendizaje.ejercicio4.main;

import ejerciciosAprendizaje.ejercicio4.entities.Rectangulo;

public class ejericicio4 {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.crearRectagulo();
        System.out.println("La superficie es: "+ rectangulo1.calcularSuperficie(rectangulo1.getBase(), rectangulo1.getAltura()));
        System.out.println("El perímetro es: "+ rectangulo1.calcularPerimetro(rectangulo1.getBase(), rectangulo1.getAltura()));
        rectangulo1.dibujarRectangulo(rectangulo1.getBase(), rectangulo1.getAltura());

    }
}
