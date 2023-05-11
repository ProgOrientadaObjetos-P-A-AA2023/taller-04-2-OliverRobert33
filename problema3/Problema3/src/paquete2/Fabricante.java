
package paquete2;


public class Fabricante {

    private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "Casabaca";
        ciudad = "Cuenca";
    }

    public Fabricante(String n, String c) {
        nombre = n;
        ciudad = c;
    }
    

    // Metodos establecer
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }


    // Metodos obtener

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
}
