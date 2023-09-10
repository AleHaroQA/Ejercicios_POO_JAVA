package ejerciciosExtra.ejercicioExtra3.entities;

public class Raices {

    /*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
    ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
    Hay que insertar estos 3 valores para construir el objeto a través de un método
    constructor.*/

    //Atributos

    private double a;
    private double b;
    private double c;

    //constructores


    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getters y setters

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
     */

    public double getDiscriminante(Raices r){

        double discriminante;

        discriminante = (Math.pow(r.getB(),2) - 4*r.getA()*r.getC());

        return discriminante;
    }
}
