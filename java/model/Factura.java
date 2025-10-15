package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String codigo;
    private LocalDate fecha;
    private double total;
    private Cliente cliente;
    private List<DetalleFactura> listaDetallesFactura;

    public Factura(String codigo, LocalDate fecha, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.listaDetallesFactura = new ArrayList<>();
    }

    public void agregarDetalle(DetalleFactura detalle) {
        listaDetallesFactura.add(detalle);
    }

    public double calcularTotal() {
        double suma = 0;
        for (DetalleFactura d : listaDetallesFactura) {
            suma += d.getSubTotal();
        }
        double descuento = suma * cliente.calcularDescuento();
        total = suma - descuento;
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura #" + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente);
        System.out.println("Detalles:");
        for (DetalleFactura d : listaDetallesFactura) {
            System.out.println("  - " + d);
        }
        System.out.println("Total con descuento: $" + calcularTotal());
        System.out.println("-----------------------------");
    }
}
