package app;

import java.time.LocalDate;
import model.*;

public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Comercializadora UQ", "Calle 15 #10-30", "900456321-0");

        // Registrar clientes
        Cliente cli1 = new ClienteFrecuente("Laura Gómez", "12345", "Calle 10", 200);
        Cliente cli2 = new ClienteCorporativo("TechCorp S.A.", "67890", "Zona Industrial", "900789654-1", 0.10);

        empresa.registrarCliente(cli1);
        empresa.registrarCliente(cli2);

        // Registrar productos
        Producto prod1 = new ProductoAlimenticio("A001", "Arroz 5kg", 25000, 50, LocalDate.of(2025, 12, 31));
        Producto prod2 = new ProductoElectrodomestico("E001", "Televisor 50\"", 1800000, 10, 24);
        Producto prod3 = new ProductoAlimenticio("A002", "Café 500g", 18000, 100, LocalDate.of(2026, 6, 30));

        empresa.registrarProducto(prod1);
        empresa.registrarProducto(prod2);
        empresa.registrarProducto(prod3);

        // Crear factura
        Factura factura1 = new Factura("F001", LocalDate.now(), cli1);
        factura1.agregarDetalle(new DetalleFactura(prod1, 2));
        factura1.agregarDetalle(new DetalleFactura(prod3, 1));

        empresa.registrarFactura(factura1);

        // Crear otra factura
        Factura factura2 = new Factura("F002", LocalDate.now(), cli2);
        factura2.agregarDetalle(new DetalleFactura(prod2, 1));

        empresa.registrarFactura(factura2);

        // Mostrar facturas
        empresa.mostrarFacturas();
    }
}
