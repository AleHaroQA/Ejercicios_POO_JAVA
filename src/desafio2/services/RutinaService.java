package desafio2.services;

import desafio2.entities.Rutina;

import java.util.ArrayList;
import java.util.Scanner;

public class RutinaService {

    Scanner read = new Scanner(System.in);

    public Rutina crearRutina(){

        Rutina r1 = new Rutina();
        System.out.println("Ingrese el ID de la rutina");
        r1.setId(read.nextInt());
        System.out.println("Ingrese el nombre de la rutina");
        r1.setNombre(read.nextLine());
        System.out.println("Ingrese la duracion de la rutina");
        r1.setDuracion(read.nextInt());
        System.out.println("Ingrese el nivel de dificultad de la rutina");
        r1.setNivelDificultad(read.nextInt());
        System.out.println("Ingrese la descripcion de la rutina");
        r1.setDescripcion(read.next());
        return r1;
    }

    public void obtenerRutinas(ArrayList<Rutina> rutinas){
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }

    public void actualizarRutina(ArrayList<Rutina> rutinas, int id, String nombre, int duracion, int nivelDificultad, String descripcion){
        for (Rutina r1 : rutinas) {
            if (r1.getId() == id) {

                r1.setNombre(nombre);
                r1.setDuracion(duracion);
                r1.setNivelDificultad(duracion);
                r1.setDescripcion(descripcion);

            }

        }
    }

    public void eliminarRutina(ArrayList<Rutina> rutinas, int id){
        for (Rutina r1 : rutinas) {
            if (r1.getId() == id){
                rutinas.remove(r1);
                System.out.println("Rutina " + id + " eliminada con éxito");
                break;
            }
        }
    }
}
