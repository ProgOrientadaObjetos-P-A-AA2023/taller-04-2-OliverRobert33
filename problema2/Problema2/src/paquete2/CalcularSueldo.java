package paquete2;

public class CalcularSueldo {

    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private Provincia provincia;

    // Valores del objeto 1
    public CalcularSueldo() {
        nombre = "Oliver Roberto";
        apellido = "Saraguro Remache";
        cedula = 1727135996;
        sueldoBasico = 450.00;

    }

    // Se manda valores del objeto 2
    public CalcularSueldo(String n, String a, int c, double sB, Provincia p) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = sB;
        provincia = p;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double sB) {
        sueldoBasico = sB;
    }

    public void calcularSueldoTotal() {
        double iva = (sueldoBasico * 20) / 100;
        sueldoTotal = sueldoBasico + iva;
    }
    public void establecerProvincia(Provincia pro) {
        provincia = pro;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    public Provincia obtenerProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Sueldo de un Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %d\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Provincia de Nacimiento: %s\n"
                + "Numero de Habitantes: %d\n",
                nombre,
                apellido,
                cedula,
                sueldoBasico,
                sueldoTotal,
                provincia.obtenerNombreProvincia(),
                provincia.obtenerNumeroHabitantes());
        return cadena;
    }
}
