package model;

public class ClienteFrecuente extends Cliente {
    private int puntosFidelidad;
    private final double porcentajeDescuento = 0.05;

    public ClienteFrecuente(String nombre, String cedula, String direccion, int puntosFidelidad) {
        super(nombre, cedula, direccion);
        this.puntosFidelidad = puntosFidelidad;
    }

    @Override
    public double calcularDescuento() {
        return porcentajeDescuento;
    }
}
