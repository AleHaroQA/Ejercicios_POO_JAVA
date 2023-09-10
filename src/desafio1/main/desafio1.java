package desafio1.main;

import desafio1.entities.*;
import desafio1.services.*;

import java.util.Scanner;

public class desafio1 {

    public static void main(String[] args) {

        PeliculaService pService = new PeliculaService();
        AlquilerService alService = new AlquilerService();
        Pelicula[] peliculas = new Pelicula[5];
        Alquiler[] alquileres = new Alquiler[3];
        menu(peliculas, alquileres, pService, alService);
    }

    public static void menu(Pelicula[] peliculas, Alquiler[] alquileres, PeliculaService ps, AlquilerService as) {

        Scanner reader = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.println(" ");
            System.out.println("==SERVICIO DE ALQUILER DE PELICULAS==");
            System.out.println(" MENÚ");
            System.out.println("1. Cargar una película");
            System.out.println("2. Listar todas las películas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Listar todos los alquileres");
            System.out.println("5. Buscar película por título o género");
            System.out.println("6. Buscar alquiler por fecha");
            System.out.println("7. Total alquiler");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = reader.nextInt();
            reader.nextLine();
            switch (opcion) {
                case 1:
                    ps.cargarPeliculas(peliculas);
                    break;
                case 2:
                    if (peliculas[0] == null) {
                        System.out.println("Primero debe cargar las películas, debe seleccionar opción 1");
                        break;
                    } else {
                        ps.listarPeliculas(peliculas);
                        break;
                    }
                case 3:
                    as.cargarAlquileres(alquileres);
                    break;
                case 4:
                    if (alquileres[0] == null) {
                        System.out.println("Primero debe alquilar películas, seleccionar opción 3");
                        break;
                    } else {
                        as.listarAlquileres(alquileres);
                        break;
                    }
                case 5:
                    if (peliculas[0] == null) {
                        System.out.println("Primero debe cargar las películas, debe seleccionar opción 1");
                        break;
                    } else {
                        System.out.println("Elija buscar por: 1)título o 2) género");
                        int op = reader.nextInt();
                        if (op == 1) {
                            ps.buscarPorTitulo(peliculas);
                        } else {
                            ps.buscarPorGenero(peliculas);
                        }
                        break;
                    }
                case 6:
                    if (alquileres[0] == null) {
                        System.out.println("Primero debe alquilar películas, seleccionar opción 3");
                        break;
                    } else {
                        as.buscarAlquiler(alquileres);
                        break;
                    }
                case 7:
                    if (alquileres[0] == null) {
                        System.out.println("Primero debe alquilar películas, seleccionar opción 3");
                        break;
                    } else {
                        as.calcularIngresoTotal(alquileres);
                        break;
                    }
                case 8:
                    System.out.println("Cerrando sesión");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (salir != true);

    }
}
