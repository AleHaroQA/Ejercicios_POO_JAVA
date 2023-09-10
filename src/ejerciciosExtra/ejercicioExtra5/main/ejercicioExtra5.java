package ejerciciosExtra.ejercicioExtra5.main;

import ejerciciosExtra.ejercicioExtra5.entities.MesSecreto;
import ejerciciosExtra.ejercicioExtra5.services.MesSecretoService;

public class ejercicioExtra5 {

    public static void main(String[] args) {

        MesSecretoService mss = new MesSecretoService();
        MesSecreto mes = mss.crearObjeto();
        mss.encontrarMes(mes);
    }
}
