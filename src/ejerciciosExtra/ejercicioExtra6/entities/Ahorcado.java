package ejerciciosExtra.ejercicioExtra6.entities;

public class Ahorcado {

    /*
    Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
    como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
    cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
    con los parámetros que sean necesarios:
     Constructores, tanto el vacío como el parametrizado.
     */

    //Atributos

    private String[] palabraABuscar;
    private int letrasEncontradas;
    private int jugadasMax;
    private String letra;
    private String[] encontradas;


//Constructores

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int jugadasMax, String[] encontradas) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = 0;
        this.jugadasMax = jugadasMax;
        this.letra = "";
        this.encontradas = encontradas;
    }

    //Getters y setters

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String[] getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(String[] encontradas) {
        this.encontradas = encontradas;
    }
}
