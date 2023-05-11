package paquete1;

import paquete2.*;

public class Ejecutor {

    public static void main(String[] args) {

        // Constructor 1
        Cliente cliente1 = new Cliente("Roberto", "Loarte");

        Banco banco1 = new Banco("Produbanco");
        
        CalcularComision calcularComision1 = new CalcularComision(cliente1, banco1);
        calcularComision1.calcularComisionBanco();
        System.out.println(calcularComision1);
        System.out.println("----------------------------------------");


        
        // Constructor 2
        Cliente cliente2 = new Cliente("Luis", "Mora", "134335357");
        Banco banco2 = new Banco("Pichincha", 25);
        CalcularComision calcularComision2 = new CalcularComision(200000, cliente2, banco2);
        calcularComision2.calcularComisionBanco();
        System.out.println(calcularComision2);
        System.out.println("----------------------------------------");

    }

}
