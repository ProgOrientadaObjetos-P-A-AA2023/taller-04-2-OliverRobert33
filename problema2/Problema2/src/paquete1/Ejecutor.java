
package paquete1;

import paquete2.*;

public class Ejecutor {

    public static void main(String[] args) {
                
        CalcularSueldo profesor1 = new CalcularSueldo();
        Provincia provinciaNacimiento = new Provincia();
        
        provinciaNacimiento.establecerNombreProvincia("Tungurahua");
        provinciaNacimiento.establecerNumeroHabitantes(999999);
        
        profesor1.calcularSueldoTotal();
        profesor1.establecerProvincia(provinciaNacimiento);
        System.out.println(profesor1);

        System.out.println("------------------------------------------");

                
        Provincia provinciaNacimiento2 = new Provincia("Esmeralda", 3333);
        
        CalcularSueldo profesor2 = new CalcularSueldo("Bertha Cecilia"
                , "Remache Quisphi", 1103808888, 700, provinciaNacimiento2);
        profesor2.calcularSueldoTotal();
        System.out.println(profesor2);



    }
    
}
