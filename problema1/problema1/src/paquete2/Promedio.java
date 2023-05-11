package paquete2;

public class Promedio {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificaciones;
    private Universidad universidad;

    public Promedio(double c1, double c2, double c3, Universidad u) {
        nombreEstudiante = "Leonel Saraguro";
        calificacionMateria1 = c1;
        calificacionMateria2 = c2;
        calificacionMateria3 = c3;
        universidad = u;

    }

    public Promedio(String n, Universidad u) {
        nombreEstudiante = n;
        calificacionMateria1 = 8.80;
        calificacionMateria2 = 9.00;
        calificacionMateria3 = 9.50;
        universidad = u;

    }

    public void establecerUniversidad(Universidad u) {
        universidad = u;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public void establecerCalificacionMateria1(double n) {
        calificacionMateria1 = n;
    }

    public void establecerCalificacionMateria2(double n) {
        calificacionMateria2 = n;
    }

    public void establecerCalificacionMateria3(double n) {
        calificacionMateria3 = n;
    }

    public void calcularPromedio() {
        promedioCalificaciones = (calificacionMateria1 + calificacionMateria2 
                + calificacionMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public Universidad obtenerUniversidad() {
        return universidad;

    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format(""
                + "Notas del Estudiante\n"
                + "Nombre de Estudiante: %s\n"
                + "Calificacion Materia 1: %.2f\n"
                + "Calificacion Materia 2: %.2f\n"
                + "Calificacion Materia 3: %.2f\n"
                + "Promedio: %.2f\n"
                + "Nombre de la Universidad: %s\n"
                + "Direccion de la Universidad: %s\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionMateria1(),
                obtenerCalificacionMateria2(),
                obtenerCalificacionMateria3(),
                obtenerPromedioCalificaciones(),
                obtenerUniversidad().obtenerNombreUniversidad(),
                obtenerUniversidad().obtenerDireccionUniversidad()
        );
        return cadena;
    }
;

}
