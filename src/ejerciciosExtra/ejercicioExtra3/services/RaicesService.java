package ejerciciosExtra.ejercicioExtra3.services;

import ejerciciosExtra.ejercicioExtra3.entities.Raices;

public class RaicesService {

    /* (-r.getB() - Math.sqrt(discriminante)) / (2 * r.getA());
        (-r.getB())/(2 * r.getA());*/


    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.*/

    public boolean tieneRaices(Raices r) {

        boolean tieneRaices = false;

        if (r.getDiscriminante(r) > 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }

    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0.*/

    public boolean tieneRaiz(Raices r) {

        boolean tieneRaiz = false;

        if (r.getDiscriminante(r) == 0) {
            tieneRaiz = true;
        }
        return tieneRaiz;
    }

    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones.  b^{2}-4*a*c*/

    public void obtenerRaices(Raices r) {

        if (tieneRaices(r) == true) {
            System.out.println("x1= " + (-r.getB() + Math.sqrt(r.getDiscriminante(r)) / (2 * r.getA())));
            System.out.println("x2= " + (-r.getB() - Math.sqrt(r.getDiscriminante(r)) / (2 * r.getA())));
        }
    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.*/

    public void obtenerRaiz(Raices r) {

        if (tieneRaiz(r) == true) {
            System.out.println("x1= " + (-r.getB()) / (2 * r.getA()));
        }

    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje. */

    public void calcular(Raices r) {

        if (tieneRaices(r) || tieneRaiz(r) == true) {
            obtenerRaices(r);
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene solución");
        }

    }


}
