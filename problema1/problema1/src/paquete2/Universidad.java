package paquete2;

public class Universidad {

    private String nombreUniversidad;
    private String direccionUniversidad;

    public Universidad() {
        nombreUniversidad = "Universidad Tecnica Particular de Loja";
        direccionUniversidad = "Ciudadela San Cayetano Alto y Calle París";
    }

    public Universidad(String n, String d) {

        nombreUniversidad = n;
        direccionUniversidad = d;

    }

    public void establecerNombreUniversidad(String n) {
        nombreUniversidad = n;
    }

    public void establecerDireccionUniversidad(String d) {
        direccionUniversidad = d;
    }

    public String obtenerNombreUniversidad() {
        return nombreUniversidad;
    }

    public String obtenerDireccionUniversidad() {
        return direccionUniversidad;
    }
}
