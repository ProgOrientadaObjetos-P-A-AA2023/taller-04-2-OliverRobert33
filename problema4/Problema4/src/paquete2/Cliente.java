package paquete2;

public class Cliente {

    private String nombre;
    private String apellido;
    private String cedula;

    public Cliente(String n, String a) {
        nombre = n;
        apellido = a;
        cedula = "17126849";
    }
    public Cliente(String n, String a, String c) {
        nombre = n;
        apellido = a;
        cedula = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }
}
