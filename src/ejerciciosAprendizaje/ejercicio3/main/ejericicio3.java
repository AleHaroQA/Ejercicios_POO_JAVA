package ejerciciosAprendizaje.ejercicio3.main;

import ejerciciosAprendizaje.ejercicio3.entities.Operacion;

public class ejericicio3 {

    public static void main(String[] args) {

        Operacion calculadora = new Operacion();

        calculadora.crearOperacion();

        System.out.println("La suma de los dígitos es: " + calculadora.sumar(calculadora.getNumero1(), calculadora.getNumero2()));
        System.out.println("La resta de los dígitos es: " + calculadora.restar(calculadora.getNumero1(), calculadora.getNumero2()));
        System.out.println("La multiplicación de los dígitos es: " + calculadora.multiplicar(calculadora.getNumero1(), calculadora.getNumero2()));
        System.out.println("La división de los dígitos es: " + calculadora.dividir(calculadora.getNumero1(), calculadora.getNumero2()));

    }
}
