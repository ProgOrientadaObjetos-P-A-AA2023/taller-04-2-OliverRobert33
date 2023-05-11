
package paquete2;

/**
 *
 * @author oliver
 */
public class Provincia {

    private String nombreProvincia;
    private int numeroHabitantes;

    public Provincia () {
        nombreProvincia = "AA";
        numeroHabitantes = 0000;
    }
    public Provincia (String n, int nH) {
        nombreProvincia = n;
        numeroHabitantes = nH;
    }

    public void establecerNombreProvincia(String n) {
        nombreProvincia = n;
    }

    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }

    public void establecerNumeroHabitantes(int nH) {
        numeroHabitantes = nH;
    }

    public int obtenerNumeroHabitantes() {
        return numeroHabitantes;
    }
}
