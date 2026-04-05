package Ejercicio_1_Televentas.com.televentas;

public class ServicioQuejas {
    public void registrarQueja(String cliente, String motivo) {
        System.out.println("[GERENCIA] Queja recibida de " + cliente + ": " + motivo);
        System.out.println("[SISTEMA] Queja remitida inmediatamente al Gerente de Relaciones.");
    }
}