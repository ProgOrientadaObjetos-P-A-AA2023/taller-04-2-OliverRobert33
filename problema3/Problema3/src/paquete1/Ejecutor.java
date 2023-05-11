package paquete1;

import paquete2.Vehiculo;
import paquete2.Fabricante;

public class Ejecutor {

    public static void main(String[] args) {

        // Primero
        Fabricante fabricante = new Fabricante();
        fabricante.establecerNombre("William Crapo Durant");
        fabricante.establecerCiudad("Costa Rica");

        Vehiculo vehiculo = new Vehiculo("110254888");
        vehiculo.establecerCedula("11025689");
        vehiculo.establecerMarca("Chevrolet");
        vehiculo.establecerFabricante(fabricante);
        vehiculo.establecerYear(2022);
        vehiculo.establecerValorVehiculo(60999);
        vehiculo.calcularValorMatricula();

        System.out.println(vehiculo);
        System.out.println("------------------------------------------");

        
        // Segundo
        Fabricante fabricante2 = new Fabricante();
        fabricante2.establecerNombre("Holden");
        fabricante2.establecerCiudad("Australia");

        Vehiculo vehiculo2 = new Vehiculo("11045798", "Holden Commodere", 2020, 34555, fabricante2);
        vehiculo2.calcularValorMatricula();
   
        System.out.println(vehiculo2);
        System.out.println("------------------------------------------");

    }
}
