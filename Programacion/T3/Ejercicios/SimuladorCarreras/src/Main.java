import controller.CampeonatoController;
import model.Campeonato;
import model.Coche;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            mostrarBienvenida();

            int numeroCoches = solicitarNumeroCoches();
            List<Coche> coches = crearCoches(numeroCoches);

            int numeroCarreras = solicitarNumeroCarreras();

            Campeonato campeonato = new Campeonato("Campeonato 2026", coches);

            CampeonatoController campeonatoController = new CampeonatoController();
            campeonatoController.ejecutarCampeonato(campeonato, numeroCarreras, scanner);

            System.out.println("\n¡Gracias por participar en el campeonato!");

        } catch (Exception e) {
            System.err.println("Error en la aplicación: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void mostrarBienvenida() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                                               ║");
        System.out.println("║      SIMULADOR DE CARRERAS DE COCHES         ║");
        System.out.println("║                                               ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
    }

    private static int solicitarNumeroCoches() {
        System.out.print("¿Cuántos coches participarán en el campeonato? (2-20): ");
        while (true) {
            try {
                int numero = Integer.parseInt(scanner.nextLine().trim());
                if (numero >= 2 && numero <= 20) {
                    return numero;
                }
                System.out.print("Por favor, ingrese un número entre 2 y 20: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }

    private static int solicitarNumeroCarreras() {
        System.out.print("\n¿Cuántas carreras tendrá el campeonato? (1-10): ");
        while (true) {
            try {
                int numero = Integer.parseInt(scanner.nextLine().trim());
                if (numero >= 1 && numero <= 10) {
                    return numero;
                }
                System.out.print("Por favor, ingrese un número entre 1 y 10: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }

    private static List<Coche> crearCoches(int cantidad) {
        List<Coche> coches = new ArrayList<>();
        System.out.println("\n--- REGISTRO DE COCHES ---");

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\nCoche " + i + ":");

            System.out.print("  Marca: ");
            String marca = scanner.nextLine().trim();
            while (marca.isEmpty()) {
                System.out.print("  La marca no puede estar vacía. Marca: ");
                marca = scanner.nextLine().trim();
            }

            System.out.print("  Modelo: ");
            String modelo = scanner.nextLine().trim();
            while (modelo.isEmpty()) {
                System.out.print("  El modelo no puede estar vacío. Modelo: ");
                modelo = scanner.nextLine().trim();
            }

            Coche coche = new Coche(marca, modelo, i);
            coches.add(coche);
            System.out.println("  Coche registrado: " + coche.toString());
        }

        return coches;
    }
}