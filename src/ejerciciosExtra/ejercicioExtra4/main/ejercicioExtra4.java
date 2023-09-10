package ejerciciosExtra.ejercicioExtra4.main;

import ejerciciosExtra.ejercicioExtra4.entities.NIF;
import ejerciciosExtra.ejercicioExtra4.services.NIFService;

public class ejercicioExtra4 {

    public static void main(String[] args) {

        NIFService ns= new NIFService();
        NIF nif = ns.crearNif();
        ns.mostrar(nif);

    }
}
