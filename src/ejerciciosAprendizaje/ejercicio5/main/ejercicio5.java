package ejerciciosAprendizaje.ejercicio5.main;

import ejerciciosAprendizaje.ejercicio5.entities.Cuenta;

public class ejercicio5 {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();

        c1.crearCuenta();
        c1.ingresar();
        c1.retirar();
        c1.extraccionRapida();
        c1.consultarSaldo();
        c1.consultarDatos();

    }
}
