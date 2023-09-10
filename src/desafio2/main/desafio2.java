package desafio2.main;

import desafio2.entities.Cliente;
import desafio2.entities.Rutina;
import desafio2.services.ClienteService;
import desafio2.services.RutinaService;

import java.util.ArrayList;

public class desafio2 {

    public static void main(String[] args) {

        /*Crea al menos cinco clientes con datos ficticios.
        Crea al menos cinco rutinas con datos ficticios.
        Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
        Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
        Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
        Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
        Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
        Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
        Elimina uno de los clientes existentes y muestra la lista de clientes final.
        Elimina una de las rutinas existentes y muestra la lista de rutinas final. */

        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Rutina> listaRutinas = new ArrayList<>();

        Cliente c1 = cs.registrarCliente();
        listaClientes.add(c1);
        cs.obtenerClientes(listaClientes);
        cs.actualizarCliente(listaClientes, 1,"jdsa",34,623,13," ");
        cs.obtenerClientes(listaClientes);
        cs.eliminarCliente(listaClientes,1);

    }
}
