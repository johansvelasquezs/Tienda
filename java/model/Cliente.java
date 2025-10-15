package model;

public abstract class Cliente {
    protected String nombre;
    protected String cedula;
    protected String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public abstract double calcularDescuento();

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + cedula + ")";
    }
}
