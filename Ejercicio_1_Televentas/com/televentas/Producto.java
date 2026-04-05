package Ejercicio_1_Televentas.com.televentas;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;

    public Producto(String codigo, String descripcion, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getCantidadDisponible() { return cantidadDisponible; }

    @Override
    public String toString() {
        return String.format("[%s] %s - $%.2f (Disponibles: %d)", 
                             codigo, descripcion, precio, cantidadDisponible);
    }
}