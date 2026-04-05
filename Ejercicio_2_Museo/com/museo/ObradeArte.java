package Ejercicio_2_Museo.com.museo;
import java.time.LocalDate;

public abstract class ObraDeArte {
    protected String titulo;
    protected String autor;
    protected String periodo;
    protected double valor;
    protected LocalDate fechaCreacion;
    protected String estado; // "Expuesta", "En Restauración", "Cedida"

    public ObraDeArte(String titulo, String autor, String periodo, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.periodo = periodo;
        this.valor = valor;
        this.estado = "Expuesta";
    }

    public double getValor() { return valor; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getTitulo() { return titulo; }
}