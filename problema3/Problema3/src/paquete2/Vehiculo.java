package paquete2;

/**
 * @author oliver
 */
public class Vehiculo {

    private String cedula;
    private String marca;
    private int year;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante frabicante;

    public Vehiculo(String c, String m, int y, double vv, Fabricante f) {
        cedula = c;
        marca = m;
        year = y;
        valorVehiculo = vv;
        frabicante = f;
    }

    public Vehiculo(String c) {
        cedula = c;
    }

    // Metodos establecer
    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerYear(int y) {
        year = y;
    }

    public void establecerValorVehiculo(double vv) {
        valorVehiculo = vv;
    }

    public void establecerFabricante(Fabricante f) {
        frabicante = f;
    }

    public void calcularValorMatricula() {
        double x = (0.002 * valorVehiculo);
        int y = 2023 - year;
        valorMatricula = x * y;
    }

    // Metodos obtener
    public String obtenerCedula() {
        return cedula;
    }

    public String obtenertMarcaVehiculo() {
        return marca;
    }

    public int obtenerYear() {
        return year;
    }

    public Fabricante obtenerFabricante() {
        return frabicante;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {

        String mensaje = String.format(
                "Cedula: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Año de Fabricacion: %d\n"
                + "Valor del Vehiculo: $%.3f\n"
                + "Valor de Matricula: $%.3f\n"
                + "Nombre Fabricante: %s\n"
                + "Ciudad Origen: %s\n",
                obtenerCedula(),
                obtenertMarcaVehiculo(),
                obtenerYear(),
                obtenerValorVehiculo(),
                obtenerValorMatricula(),
                frabicante.obtenerNombre(),
                frabicante.obtenerCiudad());

        return mensaje;

    }
}
