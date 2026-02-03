package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.*;

public class CampeonatoController {
    private CarreraController carreraController;

    public CampeonatoController() {
        this.carreraController = new CarreraController();
    }

    public void ejecutarCampeonato(Campeonato campeonato, int numeroCarreras, Scanner scanner) {
        System.out.println("\n╔═══════════════════════════════════════════╗");
        System.out.println("║  INICIO DEL CAMPEONATO: " + campeonato.getNombre() + "   ║");
        System.out.println("╚═══════════════════════════════════════════╝");
        System.out.println("Número de carreras: " + numeroCarreras);
        System.out.println("Participantes: " + campeonato.getCoches().size());

        for (int i = 1; i <= numeroCarreras; i++) {
            System.out.print("\nIngrese los kilómetros de la carrera " + i + ": ");
            double kmCarrera = obtenerNumeroValido(scanner, 100, 1000);

            Carrera carrera = new Carrera(i, kmCarrera, campeonato.getCoches());
            campeonato.agregarCarrera(carrera);

            carreraController.simularCarrera(carrera);
            carreraController.mostrarResultadosCarrera(carrera);

            mostrarClasificacionGeneral(campeonato, i);

            if (i < numeroCarreras) {
                System.out.println("\nPresione Enter para continuar a la siguiente carrera...");
                scanner.nextLine();
            }
        }

        mostrarClasificacionFinal(campeonato);
    }

    private double obtenerNumeroValido(Scanner scanner, double min, double max) {
        while (true) {
            try {
                double valor = Double.parseDouble(scanner.nextLine().trim());
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.printf("Por favor, ingrese un valor entre %.0f y %.0f: ", min, max);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }

    public void mostrarClasificacionGeneral(Campeonato campeonato, int carrerasCompletadas) {
        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║  CLASIFICACIÓN GENERAL (Después de carrera " + carrerasCompletadas + ")  ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        List<Coche> clasificacion = obtenerClasificacionGeneral(campeonato);

        System.out.println("┌──────┬─────────────────────────────┬────────┬────────┐");
        System.out.println("│ Pos. │ Piloto                      │ Dorsal │ Puntos │");
        System.out.println("├──────┼─────────────────────────────┼────────┼────────┤");

        for (int i = 0; i < clasificacion.size(); i++) {
            Coche coche = clasificacion.get(i);
            String posicion = (i + 1) + "º";
            System.out.printf("│ %-4s │ %-27s │ %-6d │ %-6d │%n",
                    posicion, coche.getNombreCompleto(), coche.getDorsal(), coche.getPuntosAcumulados());
        }

        System.out.println("└──────┴─────────────────────────────┴────────┴────────┘");

        if (!clasificacion.isEmpty()) {
            Coche lider = clasificacion.get(0);
            System.out.println("\nLíder del campeonato: " + lider.getNombreCompleto() +
                    " con " + lider.getPuntosAcumulados() + " puntos");
        }
    }

    private void mostrarClasificacionFinal(Campeonato campeonato) {
        System.out.println("\n\n");
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║     CLASIFICACIÓN FINAL DEL CAMPEONATO            ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        List<Coche> clasificacion = obtenerClasificacionGeneral(campeonato);

        System.out.println("\n PODIO FINAL \n");

        if (clasificacion.size() >= 1) {
            Coche primero = clasificacion.get(0);
            System.out.println("         CAMPEÓN");
            System.out.println("    " + primero.getNombreCompleto());
            System.out.println("    " + primero.getPuntosAcumulados() + " puntos\n");
        }

        if (clasificacion.size() >= 2) {
            Coche segundo = clasificacion.get(1);
            System.out.println("     SUBCAMPEÓN");
            System.out.println("    " + segundo.getNombreCompleto());
            System.out.println("    " + segundo.getPuntosAcumulados() + " puntos\n");
        }

        if (clasificacion.size() >= 3) {
            Coche tercero = clasificacion.get(2);
            System.out.println("      TERCER LUGAR");
            System.out.println("    " + tercero.getNombreCompleto());
            System.out.println("    " + tercero.getPuntosAcumulados() + " puntos\n");
        }

        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("           CLASIFICACIÓN COMPLETA");
        System.out.println("═══════════════════════════════════════════════════");

        for (int i = 0; i < clasificacion.size(); i++) {
            Coche coche = clasificacion.get(i);
            System.out.printf("%dº - %s (Dorsal %d) - %d puntos%n",
                    i + 1, coche.getNombreCompleto(), coche.getDorsal(), coche.getPuntosAcumulados());
        }
    }

    private List<Coche> obtenerClasificacionGeneral(Campeonato campeonato) {
        List<Coche> clasificacion = new ArrayList<>(campeonato.getCoches());
        clasificacion.sort((c1, c2) -> {
            int comparacionPuntos = Integer.compare(c2.getPuntosAcumulados(), c1.getPuntosAcumulados());
            if (comparacionPuntos != 0) {
                return comparacionPuntos;
            }
            return Integer.compare(c1.getDorsal(), c2.getDorsal());
        });
        return clasificacion;
    }
}