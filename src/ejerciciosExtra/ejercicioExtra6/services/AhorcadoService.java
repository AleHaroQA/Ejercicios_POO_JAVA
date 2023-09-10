package ejerciciosExtra.ejercicioExtra6.services;

import ejerciciosExtra.ejercicioExtra6.entities.Ahorcado;

import java.util.Scanner;

import static java.lang.System.in;

public class AhorcadoService {

    Scanner reader = new Scanner(in);
    /* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
    vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
    de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
    máximas, el valor que ingresó el usuario y encontradas en 0. */

    public Ahorcado crearJuego() {
        System.out.println("---------------AHORCADO-------------------");
        System.out.println("Ingrese palabra para iniciar juego:");
        String palabra = reader.next();
        System.out.println("Ingrese cantidad máxima de jugadas:");
        int jm = reader.nextInt();
        System.out.println("------------------------------------------");
        String[] aux = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        String[] auxEncontradas = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            auxEncontradas[i] = " ";
        }

        return new Ahorcado(aux, jm, auxEncontradas);
    }

    /*Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.*/

    public void longitud(Ahorcado ah) {
        System.out.println("La palabra tiene: " + ah.getPalabraABuscar().length + " letras.");
    }

    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/

    public void buscarLetra(Ahorcado ah) {

        System.out.println(" ");

        System.out.println("Ingrese una letra");
        ah.setLetra(reader.next());


        for (int i = 0; i < ah.getPalabraABuscar().length; i++) {
            if (ah.getPalabraABuscar()[i].equalsIgnoreCase(ah.getLetra())) {
                System.out.println("La letra si está en la palabra");
                break;
            } else if(i==ah.getPalabraABuscar().length) {
                System.out.println("La letra no está en la palabra");
                break;
            }
        }


    }

    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/

    public boolean encontradas(Ahorcado ah) {

        boolean esta = false;
        int cont = 0;
        for (int i = 0; i < ah.getPalabraABuscar().length; i++) {
            if (ah.getPalabraABuscar()[i].equalsIgnoreCase(ah.getLetra()) && !(ah.getEncontradas()[i].contains(ah.getLetra()))) {
                cont++;
                ah.setLetrasEncontradas(ah.getLetrasEncontradas() + cont);
                for (int j = 0; j < ah.getPalabraABuscar().length; j++) {
                    ah.getEncontradas()[i] = ah.getLetra();
                }
                esta = true;
            }
        }
        System.out.println("Letras encontradas: " + ah.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + (ah.getPalabraABuscar().length - ah.getLetrasEncontradas()));
        return esta;
    }


    /*Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/

    public void intentos(Ahorcado ah, boolean esta) {

        int contJugadas = 0;
        if (!esta && ah.getJugadasMax() > 0) {
            contJugadas++;
            ah.setJugadasMax(ah.getJugadasMax() - contJugadas);
            if (ah.getJugadasMax() != 0) {
                System.out.println("Quedan " + ah.getJugadasMax() + " intentos!");
            }

        } else if ((ah.getPalabraABuscar().length - ah.getLetrasEncontradas()) !=0 ) {
            System.out.println("Quedan " + ah.getJugadasMax() + " intentos!");
        }

    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.*/

    public void juego() {

        Ahorcado ah = crearJuego();
        longitud(ah);
        do {
            buscarLetra(ah);
            boolean esta = encontradas(ah);
            intentos(ah, esta);
            if (!esta  && ah.getJugadasMax() == 0 && ah.getLetrasEncontradas() < ah.getPalabraABuscar().length) {
                System.out.println("Perdiste :(");
            } else if (ah.getJugadasMax() >= 0 && ah.getLetrasEncontradas() == ah.getPalabraABuscar().length) {
                System.out.println("Ganaste!! :)");
            }
        } while (ah.getJugadasMax() != 0 && ah.getLetrasEncontradas() != ah.getPalabraABuscar().length);


    }

}
