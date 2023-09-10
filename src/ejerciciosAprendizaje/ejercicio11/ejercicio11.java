package ejerciciosAprendizaje.ejercicio11;

import java.util.Date;
import java.util.Scanner;


public class ejercicio11 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        /*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
        clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
        Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
        usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
        deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
        se puede conseguir instanciando un objeto Date con constructor vacío.
        Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        Ejemplo fecha actual: Date fechaActual = new Date();*/

        int dia, mes, anio;

        System.out.println("Ingrese día:");
        dia = reader.nextInt();
        System.out.println("Ingrese mes:");
        mes = reader.nextInt();
        System.out.println("Ingrese año:");
        anio = reader.nextInt();
        Date d1 = new Date(anio-1900, mes-1, dia);

        Date d2 = new Date();

        int diferencia = d2.getYear()-d1.getYear();
        System.out.println("Diferencia de años: "+diferencia);
    }
}
