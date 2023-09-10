package ejerciciosExtra.ejercicioExtra4.entities;

public class NIF {

    /* Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
    correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
    letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
     Métodos getters y setters para el número de DNI y la letra.
    La letra correspondiente al dígito verificador se calculará a traves de un método que
    funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
    número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
    buscar en un array (vector) de caracteres la posición que corresponda al resto de la
    división para obtener la letra correspondiente*/


    //Atributos

    private long DNI;
    private String letra;
    private static String calcularLetras[] ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    //Constructores


    public NIF(long DNI) {
        this.DNI = DNI;
        int pos = (int)DNI%23;
        letra = calcularLetras[pos];
    }

    //Getters y setters

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
