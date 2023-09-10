package desafio2.entities;

public class Rutina {

    /*Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
    descripcion*/

    //Atributos

    private int id;
    private String nombre;
    private int duracion;
    private int nivelDificultad;
    private String descripcion;

    //Constructores

    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    //Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //toString


    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", nivelDificultad=" + nivelDificultad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
