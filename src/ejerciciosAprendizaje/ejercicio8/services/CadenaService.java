package ejerciciosAprendizaje.ejercicio8.services;

import ejerciciosAprendizaje.ejercicio8.entities.Cadena;

import java.util.Scanner;

public class CadenaService {

    Scanner reader = new Scanner(System.in);
    /* a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada. */

    public void mostrarVocales(Cadena frase) {

        int contVocales = 0;

        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || frase.getFrase().substring(i, i + 1).equalsIgnoreCase("e") ||
                    frase.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || frase.getFrase().substring(i, i + 1).equalsIgnoreCase("o") ||
                    frase.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                contVocales++;
            }
        }
        System.out.println("La cantidad de vocales que hay en la frase es: " + contVocales);
    }

    /* b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/

    public void invertirFrase(Cadena frase){

        for (int i = frase.getLongFrase() ; i >0 ; i--) {
            System.out.print(frase.getFrase().substring(i-1 , i)); //hola
        }
        System.out.println(" ");
    }

    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */

    public void vecesRepetido(Cadena frase){
        int contCaracter = 0;
        System.out.println("Ingrese un caracter a buscar en la frase:");
        char caracter = reader.next().charAt(0);
        for (int i = 0; i <frase.getFrase().length() ; i++) {
            if (frase.getFrase().substring(i,i+1).equalsIgnoreCase(String.valueOf(caracter))) {
                contCaracter++;
            }
        }
        if (contCaracter == 0) {
            System.out.println("El caracter no está en la frase.");
        }else {
            System.out.println("El caracter se encuentra "+contCaracter+" veces.");
        }
    }

    /* d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.*/

    public void compararLongitud(Cadena frase){
        System.out.println("Ingrese otra frase:");
        String otraFrase = reader.next();

        System.out.println("Longitud frase de la clase = "+frase.getFrase().length());
        System.out.println("Longitud frase nueva = "+otraFrase.length());

        if (otraFrase.length() > frase.getFrase().length()) {
            System.out.println("La longitud de la nueva frase es mayor.");
        }else if (otraFrase.length() == frase.getFrase().length()){
            System.out.println("La longitud de las 2 frases es la misma.");
        }else{
            System.out.println("La longitud de la nueva frase es menor.");
        }
    }

    /*e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/

    public void unirFrases(Cadena frase){
        System.out.println("Ingrese otra frase:");
        String otraFrase = reader.next();

        System.out.println("Frases unidas = "+ frase.getFrase().concat(otraFrase));
    }

    /*f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    la frase resultante.*/

    public void reemplazar(Cadena frase){
        System.out.println("Ingrese caracter para reemplazar:");
        char reemplazoChar = reader.next().charAt(0);
        String fraseAux = "";
        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().substring(i,i+1).equalsIgnoreCase("a")) {
                fraseAux = fraseAux.concat(String.valueOf(reemplazoChar));
            }else{
                fraseAux = fraseAux.concat(frase.getFrase().substring(i,i+1));
            }
        }

        System.out.println("La frase reemplazada es: "+fraseAux);
    }


   /* g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */

    public boolean contiene(Cadena frase){

        boolean contieneLetra = false;

        System.out.println("Ingrese una letra para saber si la frase lo contiene: ");
        char letra = reader.next().charAt(0);

        for (int i = 0; i < frase.getFrase().length(); i++) {
            if (frase.getFrase().substring(i,i+1).equalsIgnoreCase(String.valueOf(letra))) {
                contieneLetra = true;
                break;
            }
        }
        return contieneLetra;
    }
}
