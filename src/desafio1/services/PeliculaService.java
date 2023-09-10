package desafio1.services;

import desafio1.entities.Pelicula;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class PeliculaService {
    Scanner read = new Scanner(in).useDelimiter("\n");

    public Pelicula crearPelicula(){
        Pelicula p = new Pelicula();
        Random random = new Random();
        System.out.println("Ingrese el título de la película");
        p.setTitulo(read.next());
        System.out.println("Ingrese el genero de la película");
        p.setGenero(read.next());
        p.setAnio(random.nextInt(2023));
        p.setDuracion(random.nextInt(240));
        return p;
    }

    public void cargarPeliculas(Pelicula[] pelis){
        for(int i = 0; i < pelis.length; i++){
            pelis[i] = crearPelicula();
        }
    }

    public void listarPeliculas(Pelicula[] peliculas){
        System.out.println("==Lista de peliculas==");
        //Arrays.sort(peliculas);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("========================");
    }

    public void buscarPorTitulo(Pelicula[] peliculas) {
        System.out.println("Ingrese el título de la película que desea buscar");
        String titulo = read.next();
        read.close();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("La película sí existe en la lista");
                System.out.println(pelicula);
                return;
            }
        }
        System.out.println("La película no existe en la lista");
    }

    public void buscarPorGenero(Pelicula[] peliculas){
        System.out.println("Ingrese el genero de la película que desea buscar");
        String titulo = read.next();
        read.close();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(titulo)) {
                System.out.println("El género sí existe en la lista");
                System.out.println(pelicula);
                return;
            }
        }
        System.out.println("El género no existe en la lista");
    }
}
