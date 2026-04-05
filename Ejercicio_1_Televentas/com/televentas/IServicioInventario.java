package Ejercicio_1_Televentas.com.televentas;

import java.util.List;

public interface IServicioInventario {
    Producto consultarProducto(String codigo);
    void actualizarStock(String codigo, int nuevaCantidad);
    List<Producto> obtenerCatalogo();
}