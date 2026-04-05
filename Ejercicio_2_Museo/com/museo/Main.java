package Ejercicio_2_Museo.com.museo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN MUSEO LA SALLE ===");

        // 1. SEGURIDAD: Autenticación de usuarios
        Usuario director = new Usuario("admin_dir", "1234", "DIRECTOR");
        Usuario encargado = new Usuario("sebas_cat", "pass2026", "ENCARGADO");

        if (encargado.autenticar("sebas_cat", "pass2026")) {
            System.out.println("[OK] Encargado autenticado. Accediendo al catálogo...");
        }

        // 2. ENCARGADO: Introducción de datos
        GestionMuseo museo = new GestionMuseo();
        
        Cuadro nocheEstrellada = new Cuadro(
            "La Noche Estrellada", "Van Gogh", "Postimpresionismo", 
            1000000.0, "Óleo", "Impresionista"
        );
        
        Escultura elPensador = new Escultura(
            "El Pensador", "Rodin", "Moderna", 
            500000.0, "Bronce", "Realismo"
        );

        museo.agregarObra(nocheEstrellada);
        museo.agregarObra(elPensador);
        System.out.println("[CATÁLOGO] Obras registradas con éxito.");

        // 3. RESTAURADOR: Proceso diario y daños
        System.out.println("\n[MANTENIMIENTO] Ejecutando chequeo diario...");
        museo.procesoMantenimientoDiario();
        
        // Simulación de daño inmediato
        System.out.println("[ALERTA] Se detectó una grieta en 'El Pensador'");
        elPensador.setEstado("En Restauración");
        System.out.println("Estado actual de " + elPensador.getTitulo() + ": " + elPensador.getEstado());

        // 4. DIRECTOR: Valoración Total y Gestión de Cesiones
        if (director.getRol().equals("DIRECTOR")) {
            System.out.println("\n[DIRECTOR] Consultando patrimonio total...");
            double total = museo.calcularValoracionTotal();
            System.out.println("Valoración total del inventario: $" + total);

            System.out.println("[DIRECTOR] Gestionando cesión a Museo del Louvre...");
            nocheEstrellada.setEstado("Cedida");
            System.out.println("La obra '" + nocheEstrellada.getTitulo() + "' ahora está: " + nocheEstrellada.getEstado());
        }

        System.out.println("\n=== FIN DE LA SIMULACIÓN OPERATIVA ===");
    }
}