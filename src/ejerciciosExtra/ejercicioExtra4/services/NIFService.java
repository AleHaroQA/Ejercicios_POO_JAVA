package ejerciciosExtra.ejercicioExtra4.services;

import ejerciciosExtra.ejercicioExtra4.entities.NIF;

import java.util.Scanner;

public class NIFService {

    /* Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
    resultado del calculo.*/

    Scanner reader = new Scanner(System.in);

    public NIF crearNif() {

        NIF nif;

        System.out.println("Ingrese su DNI (8 dígitos): ");
        long DNI = reader.nextLong();

        return new NIF(DNI);
    }

    /* Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
    en mayúscula; por ejemplo: 00395469-F).*/

    public void mostrar(NIF nif){

        System.out.println(nif.getDNI() + "-" +nif.getLetra());


    }


}
