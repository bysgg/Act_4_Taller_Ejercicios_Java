package Ejercicio_1_Televentas.com.televentas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoService {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void enviarPorCorreo(String emailCliente) {
        System.out.println("[EMAIL] Enviando catalogo actualizado a: " + emailCliente);
        for (Producto p : productos) {
            System.out.println(" - " + p.getDescripcion());
        }
    }

    public List<Producto> getProductos() { return productos; }
}