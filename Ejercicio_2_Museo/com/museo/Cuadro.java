package Ejercicio_2_Museo.com.museo;

public class Cuadro extends ObraDeArte {
    private String tecnica;
    private String estilo;

    public Cuadro(String titulo, String autor, String periodo, double valor, String tecnica, String estilo) {
        super(titulo, autor, periodo, valor);
        this.tecnica = tecnica;
        this.estilo = estilo;
    }
}