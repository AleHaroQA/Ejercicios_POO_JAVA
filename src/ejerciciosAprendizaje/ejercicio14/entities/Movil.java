package ejerciciosAprendizaje.ejercicio14.entities;

import java.util.Arrays;

public class Movil {

    /*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
    posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
    almacenar cada producto con su información. Crear una entidad Movil con los atributos
    marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
    un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
    correspondiente al código.
    Un constructor por defecto.
    Un constructor con todos los atributos como parámetro.
    Métodos getters y setters de cada atributo.*/

    //Atributos

    private String marca;
    private int precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    //Constructores

    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    //Getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    //toString

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}
