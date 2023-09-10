package ejerciciosAprendizaje.ejercicio9.services;

import ejerciciosAprendizaje.ejercicio9.entities.Matematica;

public class MatematicaService {

    // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor

    public void devolverMayor(Matematica mate) {

        System.out.println("El número mayor es: " + Math.max(mate.getNum1(), mate.getNum2()));

    }

    /*b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.*/

    public void calcularPotencia(Matematica mate) {

        System.out.println("La potencia de los números es: " + Math.pow(Math.max(mate.getNum1(), mate.getNum2()), Math.min(mate.getNum1(), mate.getNum2())));

    }


    /*c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/

    public void calcularRaiz(Matematica mate) {

        double numAbs = Math.abs(Math.min(mate.getNum1(), mate.getNum2()));
        System.out.println("La raíz es: " + Math.sqrt(numAbs));

    }


}
