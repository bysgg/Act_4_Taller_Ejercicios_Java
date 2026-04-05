package Ejercicio_1_Televentas.com.televentas;

public class PagoTarjeta implements MetodoPago {
    private String numero;

    public PagoTarjeta(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean procesar(double monto) {
        String ultimosDigitos = numero.substring(numero.length() - 4);
        System.out.println("[BANCO] Pago de $" + monto + " aprobado con tarjeta ****" + ultimosDigitos);
        return true;
    }
}