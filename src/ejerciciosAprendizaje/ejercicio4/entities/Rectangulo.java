package ejerciciosAprendizaje.ejercicio4.entities;

import java.util.Scanner;

public class Rectangulo {

    /*
    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
    con los datos del Rectángulo dados por el usuario. También incluirá un método para
    calcular la superficie del rectángulo y un método para calcular el perímetro del
    rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
    asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
    setters y constructores correspondientes.
    Superficie = base * altura / Perímetro = (base + altura) * 2.
     */

    //Atributos
    private int base, altura;

    //Constructores
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    //Getter y Setter

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Métodos

    public void crearRectagulo() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese base:");
        base = reader.nextInt();
        System.out.println("Ingrese altura:");
        altura = reader.nextInt();

    }

    public int calcularSuperficie(int base, int altura) {

        int superficie = base * altura;

        return superficie;
    }

    public int calcularPerimetro(int base, int altura) {

        int perimetro = (base + altura) * 2;

        return perimetro;
    }

    public void dibujarRectangulo(int base, int altura) {

        for (int i = 1; i <=altura; i++) {
            for (int j = 1; j <=base; j++) {
                if ((i > 1 && i <altura) && (j>1 && j<base)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

}
