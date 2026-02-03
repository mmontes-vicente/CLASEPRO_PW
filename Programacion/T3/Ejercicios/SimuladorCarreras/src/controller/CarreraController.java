package controller;

import model.Carrera;
import model.Coche;
import java.util.*;

public class CarreraController {
    private static final int[] PUNTOS_POSICION = {10, 8, 6, 4, 2, 1};
    private Random random;

    public CarreraController() {
        this.random = new Random();
    }

    public void simularCarrera(Carrera carrera) {
        System.out.println("\n=== SIMULANDO CARRERA " + carrera.getNumeroCarrera() + " ===");
        System.out.println("Distancia: " + carrera.getKmTotales() + " km\n");

        carrera.prepararCoches();

        int vuelta = 0;
        boolean carreraTerminada = false;

        while (!carreraTerminada) {
            vuelta++;
            System.out.println("--- Vuelta " + vuelta + " ---");

            for (Coche coche : carrera.getParticipantes()) {
                double kmAleatorios = 20 + random.nextDouble() * 30; // Entre 20 y 50 km
                coche.incrementarKm(kmAleatorios);

                if (coche.getKmRecorridos() >= carrera.getKmTotales()) {
                    carreraTerminada = true;
                }
            }

            mostrarEstadoVuelta(carrera.getParticipantes());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        List<Coche> clasificacion = ordenarPorKm(carrera.getParticipantes());
        carrera.setResultados(clasificacion);

        asignarPuntos(clasificacion);

        System.out.println("\n¡CARRERA FINALIZADA!");
    }

    private void mostrarEstadoVuelta(List<Coche> coches) {
        for (Coche coche : coches) {
            System.out.printf("%s - %.2f km%n", coche.getNombreCompleto(), coche.getKmRecorridos());
        }
        System.out.println();
    }

    private List<Coche> ordenarPorKm(List<Coche> coches) {
        List<Coche> ordenados = new ArrayList<>(coches);
        ordenados.sort((c1, c2) -> Double.compare(c2.getKmRecorridos(), c1.getKmRecorridos()));
        return ordenados;
    }

    private void asignarPuntos(List<Coche> clasificacion) {
        for (int i = 0; i < clasificacion.size() && i < PUNTOS_POSICION.length; i++) {
            clasificacion.get(i).agregarPuntos(PUNTOS_POSICION[i]);
        }
    }

    public void mostrarResultadosCarrera(Carrera carrera) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║     RESULTADOS CARRERA " + carrera.getNumeroCarrera() + "            ║");
        System.out.println("╚════════════════════════════════════════╝");

        List<Coche> resultados = carrera.getResultados();
        for (int i = 0; i < resultados.size() && i < 3; i++) {
            Coche coche = resultados.get(i);
            int puntos = (i < PUNTOS_POSICION.length) ? PUNTOS_POSICION[i] : 0;
            System.out.printf("%dº - %s [%.2f km] - %d puntos%n",
                    i + 1, coche.toString(), coche.getKmRecorridos(), puntos);
        }

        if (resultados.size() > 3) {
            System.out.println("\nOtros participantes:");
            for (int i = 3; i < resultados.size(); i++) {
                Coche coche = resultados.get(i);
                int puntos = (i < PUNTOS_POSICION.length) ? PUNTOS_POSICION[i] : 0;
                System.out.printf("   %dº - %s [%.2f km] - %d puntos%n",
                        i + 1, coche.toString(), coche.getKmRecorridos(), puntos);
            }
        }
    }
}