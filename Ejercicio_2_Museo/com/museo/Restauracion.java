package Ejercicio_2_Museo.com.museo;
import java.time.LocalDate;

public class Restauracion {
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Restauracion(String tipo, LocalDate inicio) {
        this.tipo = tipo;
        this.fechaInicio = inicio;
    }

    public void finalizar(LocalDate fin) { this.fechaFin = fin; }

    @Override
    public String toString() {
        return String.format("Tipo: %s | Inicio: %s | Fin: %s", tipo, fechaInicio, fechaFin);
    }
}