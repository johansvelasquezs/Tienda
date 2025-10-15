package model;

public class DetalleFactura {
    private Producto producto;
    private int cantidadComprada;
    private double subTotal;

    public DetalleFactura(Producto producto, int cantidadComprada) {
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.subTotal = producto.getPrecioUnitario() * cantidadComprada;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Producto getProducto() {
        return producto;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidadComprada + " = $" + subTotal;
    }
}
