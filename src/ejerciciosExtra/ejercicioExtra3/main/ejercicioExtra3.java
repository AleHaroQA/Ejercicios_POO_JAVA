package ejerciciosExtra.ejercicioExtra3.main;

import ejerciciosExtra.ejercicioExtra3.entities.Raices;
import ejerciciosExtra.ejercicioExtra3.services.RaicesService;

public class ejercicioExtra3 {

    public static void main(String[] args) {

        RaicesService rs = new RaicesService();
        Raices r = new Raices(5,1,-10);
        rs.calcular(r);
    }
}
