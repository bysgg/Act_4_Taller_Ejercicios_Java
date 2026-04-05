package Ejercicio_1_Televentas.com.televentas;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA TELEVENTAS V1.0 ===");

        // 1. Setup del Catálogo
        CatalogoService catalogo = new CatalogoService();
        Producto p1 = new Producto("A01", "Laptop Gamer", 3500.0, 10);
        Producto p2 = new Producto("B02", "Mouse Optico", 50.0, 50);
        catalogo.agregarProducto(p1);
        catalogo.agregarProducto(p2);

        // 2. Cliente consulta y pide catálogo por correo
        System.out.println("\n[CLIENTE] Consultando catálogo...");
        catalogo.enviarPorCorreo("sebastian@lasalle.edu.co");

        // 3. Crear Orden de Compra
        MetodoPago tarjeta = new PagoTarjeta("1234-5678-9012-3456");
        OrdenCompra miOrden = new OrdenCompra("Sebastian", tarjeta);
        miOrden.agregarProducto(p1);
        miOrden.agregarProducto(p2);

        System.out.println("Total de la orden: $" + miOrden.obtenerTotal());

        // NUEVO: Procesar el pago antes de armar
        miOrden.procesarOrden();

        // 4. Agente de Depósito (Armar)
        System.out.println("\n[DEPOSITO] Armando pedido...");
        if (miOrden.getEstado() == EstadoOrden.PAGADA) {
            miOrden.setEstado(EstadoOrden.ARMADA);
        }

        // 5. Simular una Queja
        ServicioQuejas quejas = new ServicioQuejas();
        quejas.registrarQueja("Sebastian", "El paquete llegó con la caja abollada.");

        System.out.println("\n=== PROCESO FINALIZADO CON ÉXITO ===");
    }
}