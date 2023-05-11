package paquete1;

import paquete2.Promedio;
import paquete2.Universidad;

/**
 *
 * @author oliver
 */
public class Ejecutor {

    public static void main(String[] args) {

        Universidad universidad1 = new Universidad();
        Promedio promedio1 = new Promedio("Froilan Remache", universidad1);
        promedio1.calcularPromedio();
        System.out.println(promedio1);

        System.out.println("------------------------------------------");

        Universidad universidad2 = new Universidad("UIDE",
                "Av. Manuel Agustín Aguirre entre Alonzo de Mercadillo y Lourdes.");
        Promedio notas2 = new Promedio(8.76, 7.90, 10.00, universidad2);
        notas2.calcularPromedio();
        System.out.println(notas2);
        System.out.println("------------------------------------------");

    }

}
