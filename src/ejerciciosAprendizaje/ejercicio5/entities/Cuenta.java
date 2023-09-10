package ejerciciosAprendizaje.ejercicio5.entities;

import java.util.Scanner;

import static java.lang.System.in;

public class Cuenta {

    /*
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes.
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
     */

    //Atributos

    private int numeroCuenta, saldoActual;
    private long DNI;

    //Constructores

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.DNI = DNI;
    }

    //Getters y Setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    //Métodos

    public void crearCuenta() {

        Scanner reader = new Scanner(in);
        System.out.println("Ingrese DNI:");
        DNI = reader.nextLong();
        numeroCuenta = (int) DNI / 10;
        saldoActual = 0;
    }

    public void ingresar() {

        double ingreso;

        Scanner reader = new Scanner(in);
        System.out.println("Ingrese monto de dinero a abonar:");
        ingreso = reader.nextDouble();

        saldoActual += ingreso;

        System.out.println("Saldo: " + saldoActual);

    }

    public void retirar() {

        double retiro;

        Scanner reader = new Scanner(in);
        System.out.println("Ingrese monto de dinero a retirar:");
        retiro = reader.nextDouble();

        if (saldoActual < retiro) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }

        System.out.println("Saldo: " + saldoActual);
    }

    public void extraccionRapida() {

        Scanner reader = new Scanner(System.in);
        double veintePorciento = saldoActual * 0.2;
        double montoExtraccion;

        System.out.println("Monto máximo a retirar:" + veintePorciento);
        System.out.println("Ingrese monto para extracción rápida:");
        montoExtraccion = reader.nextDouble();

        if (montoExtraccion > veintePorciento) {
            System.out.println("El monto máximo a retirar:" + veintePorciento);
            System.out.println("Intente nuevamente,.");
        } else {
            saldoActual -= montoExtraccion;
            System.out.println("Saldo: " + saldoActual);
        }
    }

    public void consultarSaldo() {

        System.out.println("Saldo disponible: " + saldoActual);
    }

    public void consultarDatos() {

        System.out.println("DNI: " + DNI);
        System.out.println("N° de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldoActual);
    }

}
