package desafio2.services;

import desafio2.entities.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    Scanner read = new Scanner(System.in);

    public Cliente registrarCliente(){

        Cliente c1 = new Cliente();
        c1.setId(c1.getId()+1);
        System.out.println("Ingrese el nombre del cliente");
        c1.setNombre(read.next());
        System.out.println("Ingrese la edad del cliente");
        c1.setEdad(read.nextInt());
        System.out.println("Ingrese altura del cliente");
        c1.setAltura(read.nextDouble());
        System.out.println("Ingrese el peso del cliente");
        c1.setPeso(read.nextDouble());
        System.out.println("Ingrese el objetivo del cliente");
        c1.setObjetivo(read.nextLine());
        return c1;

    }

    public Cliente modificarCliente(){

        Cliente c1 = new Cliente();
        System.out.println("Ingrese el nombre del cliente");
        c1.setNombre(read.nextLine());
        System.out.println("Ingrese la edad del cliente");
        c1.setEdad(read.nextInt());
        System.out.println("Ingrese altura del cliente");
        c1.setAltura(read.nextDouble());
        System.out.println("Ingrese el peso del cliente");
        c1.setPeso(read.nextDouble());
        System.out.println("Ingrese el objetivo del cliente");
        c1.setObjetivo(read.next());

        return c1;
    }

    public void obtenerClientes(ArrayList<Cliente> clientes){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

 /*   public void actualizarCliente(ArrayList<Cliente> clientes, int id, String nombre, int edad, double altura, double peso, String objetivo){
        for (Cliente e : clientes) {
            if (e.getId() == id) {
                e.setNombre(nombre);
                e.setEdad(edad);
                e.setAltura(altura);
                e.setPeso(peso);
                e.setObjetivo(objetivo);

            }
        }

    }*/

   /* public void actualizarCliente(ArrayList<Cliente> clientes, int id){
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                clientes.set(c.getId()-1, modificarCliente());

            }
        }

    }*/

    public void actualizarCliente(ArrayList<Cliente> clientes, int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getId() == id) {
                Cliente clienteActualizado = new Cliente(id, nombre, edad, altura, peso, objetivo);
                clientes.set(i, clienteActualizado);
                System.out.println("Cliente actualizado: " + clienteActualizado);
                break;
            }
        }
    }


    public void eliminarCliente(ArrayList<Cliente> clientes, int id){
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                clientes.remove(c);
                System.out.println("Cliente "+ id + " eliminado con exito");
                break;
            }
        }

    }
}
