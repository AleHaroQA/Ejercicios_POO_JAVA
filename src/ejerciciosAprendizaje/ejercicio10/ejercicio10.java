package ejerciciosAprendizaje.ejercicio10;

import java.util.Arrays;

public class ejercicio10 {

    public static void main(String[] args) {

        /* Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
        de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
        programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
        Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
        ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
        0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
        20. */

        int A = 50;
        int B = 20;
        double arregloA[] = new double[A];
        double arregloB[] = new double[B];

        for (int i = 0; i < A; i++) {
            arregloA[i]= (int) (Math.random()*10)+1;
        }

        System.out.println(Arrays.toString(arregloA));
        System.out.println(" ");

        Arrays.sort(arregloA);

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        Arrays.fill(arregloB,10,20,0.5);

        System.out.println("Arreglo A");
        System.out.println(Arrays.toString(arregloA));
        System.out.println(" ");
        System.out.println("Arreglo B");
        System.out.println(Arrays.toString(arregloB));
    }
}
