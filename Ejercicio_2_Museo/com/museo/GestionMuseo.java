package Ejercicio_2_Museo.com.museo;

import java.util.ArrayList;
import java.util.List;

public class GestionMuseo {
    private List<ObraDeArte> inventario = new ArrayList<>();

    public void agregarObra(ObraDeArte obra) {
        inventario.add(obra);
    }

    // Requisito Director: Suma total
    public double calcularValoracionTotal() {
        return inventario.stream().mapToDouble(ObraDeArte::getValor).sum();
    }

    // Requisito Restaurador: Proceso diario de 5 años
    public void procesoMantenimientoDiario() {
        System.out.println("[SISTEMA] Ejecutando chequeo automático de 5 años...");
        // Aquí iría la lógica de fechas
    }

    public List<ObraDeArte> getInventario() {
    return inventario;
}
}
