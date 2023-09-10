package ejerciciosAprendizaje.ejercicio7.main;

import ejerciciosAprendizaje.ejercicio7.entities.Persona;
import ejerciciosAprendizaje.ejercicio7.services.PersonaService;

public class ejercicio7 {

    public static void main(String[] args) {

        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
                tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        persona es mayor de edad.
                Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/


        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        Persona p2 = new Persona("Ale", 15, 'M', 50, 1.53);
        Persona p3 = new Persona("Miguel", 50, 'H', 130, 1.65);
        Persona p4 = new Persona("María", 18, 'M', 50, 1.80);

        int IMC1 = ps.calcularIMC(p1);
        int IMC2 = ps.calcularIMC(p2);
        int IMC3 = ps.calcularIMC(p3);
        int IMC4 = ps.calcularIMC(p4);

        boolean mayor1 = ps.esMayorDeEdad(p1);
        boolean mayor2 = ps.esMayorDeEdad(p2);
        boolean mayor3 = ps.esMayorDeEdad(p3);
        boolean mayor4 = ps.esMayorDeEdad(p4);

        //creamos vectores para recorrer IMC
        int personasIMC[] = new int[4];
        personasIMC[0] = IMC1;
        personasIMC[1] = IMC2;
        personasIMC[2] = IMC3;
        personasIMC[3] = IMC4;

        //contadores
        double contBajo = 0;
        double contIdeal = 0;
        double contAlto = 0;

        //recorremos vector y sumamos contadores
        for (int i = 0; i < personasIMC.length; i++) {
            if (personasIMC[i] == -1) {
                contBajo++;
            } else if (personasIMC[i] == 0) {
                contIdeal++;
            } else {
                contAlto++;
            }
        }

        // lo mismo para la edad
        //vector
        boolean personasMayor[] = new boolean[4];
        personasMayor[0] = mayor1;
        personasMayor[1] = mayor2;
        personasMayor[2] = mayor3;
        personasMayor[3] = mayor4;

        //contadores
        double contMayorEdad = 0;
        double contMenorEdad = 0;

        //recorrer vector para sumar contadores
        for (int i = 0; i < personasMayor.length; i++) {
            if (personasMayor[i] == true) {
                contMayorEdad++;
            } else {
                contMenorEdad++;

            }
        }

        //Saqué el porcentaje con regla de 3

        System.out.println("Porcentaje de personas bajo peso:" +(contBajo*100)/4);
        System.out.println("Porcentaje de personas con peso ideal:" +(contIdeal*100)/4);
        System.out.println("Porcentaje de personas sobrepeso:" +(contAlto*100)/4);
        System.out.println("Porcentaje de personas mayores de edad:" +(contMayorEdad*100)/4);
        System.out.println("Porcentaje de personas menores de edad:" +(contMenorEdad*100)/4);

    }
}
