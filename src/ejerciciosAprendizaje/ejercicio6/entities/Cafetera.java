package ejerciciosAprendizaje.ejercicio6.entities;

public class Cafetera {

    /*
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
    métodos:
     Constructor predeterminado o vacío
     Constructor con la capacidad máxima y la cantidad actual
     Métodos getters y setters.
     Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    máxima.
     Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
     Método vaciarCafetera(): pone la cantidad de café actual en cero.
     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.
     */

    //Atributos
    static final int capacidadMaxima = 1000;
    private int cantidadActual;

    //Constructores
    public Cafetera() {
    }

    public Cafetera(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //Getters y Setters

    public static int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //Métodos
    
    public void llenarCafetera(){

        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera se ha llenado");
    }

    public void servirTaza(int taza){

        if (cantidadActual == 0){
            System.out.println("No hay café, debe rellenar cafetera");
        }else if (cantidadActual < taza) {
            System.out.println("Quedan "+ cantidadActual +" ml en cafetera.");
            taza = cantidadActual;
            System.out.println("Se ha rellenado la taza con " + taza + " ml.");
        }else{
            cantidadActual-=taza;
            System.out.println("Se ha llenado la taza con " + taza + " ml.");
        }
    }

    public void vaciarCafetera(){
        cantidadActual = 0;
        System.out.println("La cafetera tiene "+ cantidadActual + " ml de café.");
    }

    public void agregarCafe(int cafe){

        if ((cafe+cantidadActual) > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println("La cafetera tiene "+ cantidadActual + " ml de café.");
        }else{
            cantidadActual+=cafe;
            System.out.println("La cafetera tiene "+ cantidadActual + " ml de café.");
        }


    }

}
