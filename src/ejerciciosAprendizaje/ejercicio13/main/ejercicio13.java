package ejerciciosAprendizaje.ejercicio13.main;

import ejerciciosAprendizaje.ejercicio13.entities.Curso;
import ejerciciosAprendizaje.ejercicio13.services.CursoService;

public class ejercicio13 {

    public static void main(String[] args) {

        CursoService cs = new CursoService();
        Curso c1 = cs.crearCurso();
        cs.calcularGananciaSemanal(c1);

    }
}
