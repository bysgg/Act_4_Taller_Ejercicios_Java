package Ejercicio_2_Museo.com.museo;

public class Escultura extends ObraDeArte {
    private String material;
    private String estilo;

    public Escultura(String titulo, String autor, String periodo, double valor, String material, String estilo) {
        super(titulo, autor, periodo, valor);
        this.material = material;
        this.estilo = estilo;
    }

    public void mostrarDetalles() {
        System.out.println("Escultura: " + titulo + " | Material: " + material + " | Estilo: " + estilo);
    }
}