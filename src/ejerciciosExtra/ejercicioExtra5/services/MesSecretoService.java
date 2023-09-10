package ejerciciosExtra.ejercicioExtra5.services;

import ejerciciosExtra.ejercicioExtra5.entities.MesSecreto;

import java.util.Scanner;

public class MesSecretoService {

    public MesSecreto crearObjeto() {
        MesSecreto m1 = new MesSecreto();
        int num = (int) (Math.random() * m1.getMeses().length);
        m1.setMesSecreto(m1.getMeses()[num]);
        return m1;
    }

    public void encontrarMes(MesSecreto mes) {
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Adivine el mes secreto. Introduzca el mes en minusculas");
            String respuesta = read.nextLine();

            if (respuesta.equalsIgnoreCase(mes.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (true);
    }
}
