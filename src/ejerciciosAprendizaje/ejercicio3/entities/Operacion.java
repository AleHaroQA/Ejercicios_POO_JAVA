package ejerciciosAprendizaje.ejercicio3.entities;

import java.util.Scanner;

public class Operacion {

    /*
    Crear una clase llamada Operacion que tenga como atributos privados numero1 y
    numero2. A continuación, se deben crear los siguientes métodos:
    a) Método constructor con todos los atributos pasados por parámetro.
    b) Metodo constructor sin los atributos pasados por parámetro.
    c) Métodos get y set.
    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    en los atributos del objeto.
    e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    f) Método restar(): calcular la resta de los números y devolver el resultado al main
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    Si no, se hace la multiplicación y se devuelve el resultado al main
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */

    //Atributos
    private float numero1, numero2;

    //Constructores

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {

    }

    //Getter y Setter

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    //Métodos

    public void crearOperacion() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese primer número:");
        numero1 = reader.nextFloat();
        System.out.println("Ingrese segundo número:");
        numero2 = reader.nextFloat();
    }

    public float sumar(float numero1, float numero2) {

        float suma;

        suma = numero1 + numero2;

        return suma;
    }

    public float restar(float numero1, float numero2) {

        float resta;

        resta = numero1 - numero2;

        return resta;
    }

    public float multiplicar(float numero1, float numero2) {

        float multiplicacion;

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Se está multiplicando por 0");
            return 0;
        } else {
            multiplicacion = numero1 * numero2;
            return multiplicacion;
        }

    }

    public double dividir(float numero1, float numero2) {

        double division;

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Se está dividiendo por 0");
            return 0;
        } else {
            division = numero1 / numero2;
            return division;
        }
    }


}
