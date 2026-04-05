package Ejercicio_2_Museo.com.museo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION MUSEO LA SALLE ===");

        // 1. SEGURIDAD Y ROLES
        Usuario director = new Usuario("admin_dir", "1234", "DIRECTOR");
        Usuario jefeRestaurador = new Usuario("jefe_rest", "art99", "RESTAURADOR");
        Usuario encargado = new Usuario("sebas_admin", "pass2026", "ENCARGADO");

        GestionMuseo museo = new GestionMuseo();

        // 2. ENCARGADO: Introducción de datos y verificación técnica
        if (encargado.autenticar("sebas_admin", "pass2026")) {
            System.out.println("\n[OK] Encargado autenticado. Registrando obras...");
            
            Cuadro noche = new Cuadro("La Noche Estrellada", "Van Gogh", "Postimpresionismo", 
                                      1000000.0, "Oleo", "Impresionista");
            
            ObraDeArte pensador = new Escultura("El Pensador", "Rodin", "Moderna", 
                                                 500000.0, "Bronce", "Realismo");
            
            museo.agregarObra(noche);
            museo.agregarObra(pensador);

            System.out.println("[ENCARGADO] Detalles técnicos de las obras:");
            noche.mostrarDetalles();
            ((Escultura)pensador).mostrarDetalles(); // Cast para acceder a detalles específicos
        }

        // 3. MONITOR VESTÍBULO: Consulta para Visitantes
        System.out.println("\n[MONITOR VESTIBULO] Obras actualmente en sala:");
        System.out.println(" - La Noche Estrellada (Autor: Van Gogh)");
        System.out.println(" - El Pensador (Autor: Rodin)");

        // 4. RESTAURADOR JEFE: Daño inmediato e historial
        if (jefeRestaurador.getRol().equals("RESTAURADOR")) {
            System.out.println("\n[RESTAURADOR] Alerta: Se detecto daño en 'El Pensador'.");
            
            // Buscamos la obra (en este caso usamos la referencia directa 'pensador')
            // Obtenemos la segunda obra del inventario (indice 1) para la prueba
            ObraDeArte obraADañar = museo.getInventario().get(1); 
            
            obraADañar.agregarRestauracion("Reparación de grieta por caída", LocalDate.now());
            
            System.out.println("[RESTAURADOR] Consultando historial de la obra:");
            obraADañar.mostrarHistorial();
        }

        // 5. DIRECTOR: Valoración Patrimonial y Cesiones
        if (director.getRol().equals("DIRECTOR")) {
            System.out.println("\n[DIRECTOR] Informe de Valoración Patrimonial:");
            double total = museo.calcularValoracionTotal();
            System.out.println("Suma total del inventario: $" + total);

            System.out.println("\n[DIRECTOR] Gestionando cesión a museo colaborador...");
            ObraDeArte obraACeder = museo.getInventario().get(0); // Tomamos el cuadro
            obraACeder.setEstado("Cedida al Museo del Louvre");
            
            System.out.println("Obra: " + obraACeder.getTitulo());
            System.out.println("Nuevo Estado: " + obraACeder.getEstado());
            System.out.println("Canon de cesión cobrado: $15.000 (Periodo: 6 meses)");
        }

        System.out.println("\n=== FIN DE LA SIMULACION OPERATIVA ===");
    }
}