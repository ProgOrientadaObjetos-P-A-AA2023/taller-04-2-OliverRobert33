package paquete2;

import paquete2.Cliente;

public class CalcularComision {

    private double valorCheque;
    private double comisionBanco;
    private Cliente cliente;
    private Banco banco;

    public CalcularComision(Cliente c, Banco b) {
        valorCheque = 100000;
        cliente = c;
        banco = b;
    }

    public CalcularComision(double vC, Cliente c, Banco b) {
        valorCheque = vC;
        cliente = c;
        banco = b;
    }

    // Metodos establcer
    public void establecerValorCheque(double vc) {
        valorCheque = vc;
    }

    public void calcularComisionBanco() {
        double op = valorCheque * 0.003;
        comisionBanco = op;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {

        String mensaje;

        mensaje = String.format(""
                + "Nombre Cliente: %s\n"
                + "Apellido Cliente: %s\n"
                + "Cedula: %s\n"
                + "Nombre Banco: %s\n"
                + "Numero Sucursales: %d\n"
                + "Valor de Cheque: $%.2f\n"
                + "Comision del Banco: $%.2f\n",
                obtenerCliente().obtenerNombre(),
                obtenerCliente().obtenerApellido(),
                obtenerCliente().obtenerCedula(),
                obtenerBanco().obtenerNombreBanco(),
                obtenerBanco().obtenerNumeroSucursales(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return mensaje;
    }

}
