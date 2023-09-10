package ejerciciosAprendizaje.ejercicio12.services;


import ejerciciosAprendizaje.ejercicio12.entities.PersonaDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonaDateService {

    /*crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    Scanner reader = new Scanner(System.in);

    public PersonaDate crearPersona(){

        System.out.println("Ingrese nombre:");
        String nombre = reader.next();
        System.out.println("Ingrese fecha de nacimiento: | dd/mm/aaaa");


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bd = LocalDate.parse(reader.next(),dtf);


        return new PersonaDate(nombre,bd);
    }


    /* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.*/

    public void calcularEdad(PersonaDate pd){

        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(pd.getFdn(),fechaActual);

        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                edad.getYears(), edad.getMonths(), edad.getDays());
    }

    /* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario.*/

    public boolean menorQue(PersonaDate pd){

        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(pd.getFdn(),fechaActual);
        System.out.println("Ingrese otra edad:");
        int otraEdad = reader.nextInt();

        int edadPersonaDate = edad.getYears();

        if (edadPersonaDate > otraEdad) {
            return true;
        }else {
            return false;
        }
    }

    /* Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.*/

    public String mostrarPersona(PersonaDate p1){

       return p1.toString();

    }
}
