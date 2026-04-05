package Ejercicio_1_Televentas.com.televentas;

import java.util.ArrayList;
import java.util.List;

public class OrdenCompra {
    private String cliente;
    private List<Producto> items = new ArrayList<>();
    private EstadoOrden estado;
    private MetodoPago pago;

    public OrdenCompra(String cliente, MetodoPago pago) {
        this.cliente = cliente;
        this.pago = pago;
        this.estado = EstadoOrden.INICIADA;
    }

    public void agregarProducto(Producto p) {
        if (estado == EstadoOrden.INICIADA) {
            items.add(p);
        }
    }

    public double obtenerTotal() {
        return items.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void procesarOrden() {
        double total = obtenerTotal();
        if (pago.procesar(total)) {
            this.estado = EstadoOrden.PAGADA;
            System.out.println("[SISTEMA] Pago procesado exitosamente para " + cliente);
        }
    }

}