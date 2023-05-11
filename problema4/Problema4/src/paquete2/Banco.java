package paquete2;

public class Banco {

    private String nombreBanco;
    private int numeroSucursales;

    public Banco(String b){
        nombreBanco = b;
        numeroSucursales = 20;
    }
    
    public Banco(String nB, int nS){
        nombreBanco = nB;
        numeroSucursales = nS;
    }
    
    public void establecerNombreBanco(String n) {
        nombreBanco = n;
    }

    public void establecerNumeroSucursales(int n) {
        numeroSucursales = n;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public int obtenerNumeroSucursales(){
        return numeroSucursales;
    }
}
