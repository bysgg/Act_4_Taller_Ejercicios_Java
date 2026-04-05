package Ejercicio_1_Televentas.com.televentas;

public class LogisticaService {
    public void asignarTransporte(OrdenCompra orden) {
        if (orden.getEstado() == EstadoOrden.ARMADA) {
            System.out.println("[LOGISTICA] Asignando transporte para la orden de: " + orden.getCliente());
            orden.setEstado(EstadoOrden.ENVIADA);
        }
    }
}