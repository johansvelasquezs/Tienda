package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;

    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;

    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaFacturas = new ArrayList<>();
    }

    // Métodos de gestión de clientes
    public void registrarCliente(Cliente c) {
        listaClientes.add(c);
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente c : listaClientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCliente(String cedula) {
        listaClientes.removeIf(c -> c.getCedula().equals(cedula));
    }

    // Métodos de gestión de productos
    public void registrarProducto(Producto p) {
        listaProductos.add(p);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    // Registrar facturas
    public void registrarFactura(Factura f) {
        listaFacturas.add(f);
    }

    public void mostrarFacturas() {
        for (Factura f : listaFacturas) {
            f.mostrarFactura();
        }
    }
}
