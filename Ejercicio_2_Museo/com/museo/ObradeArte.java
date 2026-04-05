package Ejercicio_2_Museo.com.museo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ObraDeArte {
    protected String titulo;
    protected String autor;
    protected String periodo;
    protected double valor;
    protected String estado;
    // 1. Verifica que esta lista exista
    protected List<Restauracion> historialRestauraciones = new ArrayList<>();

    public ObraDeArte(String titulo, String autor, String periodo, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.periodo = periodo;
        this.valor = valor;
        this.estado = "Expuesta";
    }

    // 2. ESTE MÉTODO DEBE ESTAR AQUÍ (Asegúrate que diga 'public')
    public void agregarRestauracion(String tipo, LocalDate inicio) {
        this.historialRestauraciones.add(new Restauracion(tipo, inicio));
        this.estado = "En Restauración";
    }

    // 3. ESTE MÉTODO TAMBIÉN DEBE ESTAR AQUÍ
    public void mostrarHistorial() {
        System.out.println("Historial de: " + titulo);
        if (historialRestauraciones.isEmpty()) {
            System.out.println("   (Sin registros)");
        } else {
            for (Restauracion r : historialRestauraciones) {
                System.out.println(r);
            }
        }
    }

    // Getters básicos
    public double getValor() { return valor; }
    public String getTitulo() { return titulo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) {
    this.estado = estado;
}
}