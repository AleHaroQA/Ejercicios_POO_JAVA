package ejerciciosAprendizaje.ejercicio13.services;

import constantes.Constantes;
import ejerciciosAprendizaje.ejercicio13.entities.Curso;

import java.util.Scanner;

public class CursoService {

    Scanner reader = new Scanner(System.in);
    /* método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
    nombre de cada alumno.*/

    public String[] cargarAlumnos() {
        String[] alumnosAux = new String[Constantes.CANTIDAD_ALUMNOS];
        for (int i = 0; i < Constantes.CANTIDAD_ALUMNOS; i++) {
            System.out.println("Ingrese nombre de alumno " + (i + 1) + ": ");
            alumnosAux[i] = reader.nextLine();
        }
        return alumnosAux;
    }

    /* Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnos*/

    public Curso crearCurso() {

        CursoService cs = new CursoService();

        System.out.println("Ingrese nombre del curso:");
        String nombreCurso = reader.nextLine();
        System.out.println("Ingrese cantidad de horas por día:");
        int cantidadHoras = reader.nextInt();
        System.out.println("Ingrese cantidad de días por semana:");
        int cantidadDias = reader.nextInt();
        System.out.println("Ingrese turno:");
        String turno = reader.next();
        System.out.println("Ingrese precio por hora:");
        double precioHora = reader.nextDouble();
        String [] alumnos = cs.cargarAlumnos();
        reader.close();

        return new Curso(nombreCurso, cantidadHoras, cantidadDias, turno, precioHora, alumnos);
    }

    /* Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
     */

    public void calcularGananciaSemanal(Curso c) {

        double gananciaSemana = c.getCantidadDiasPorSemana() * c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length;

        System.out.println("La ganancia semanal es de: " + gananciaSemana);
    }


}
