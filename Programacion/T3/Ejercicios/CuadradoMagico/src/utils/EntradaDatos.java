package utils;

import java.util.Scanner;

/**
 * Clase utilidad para manejar la entrada de datos del usuario.
 */
public class EntradaDatos {

    /**
     * Solicita al usuario el tamaño de la matriz y valida la entrada.
     * @return El tamaño n de la matriz n×n
     */
    public static int solicitarTamanoMatriz() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Introduce el tamaño de la matriz (n): ");
                n = scanner.nextInt();

                if (n < 3) {
                    System.out.println("El tamaño debe ser al menos 3. Intenta de nuevo.\n");
                } else if (n > 5) {
                    System.out.println("\n⚠ ADVERTENCIA: Para n > 5, el tiempo de búsqueda puede ser muy largo.");
                    System.out.print("¿Deseas continuar? (s/n): ");
                    scanner.nextLine(); // Limpiar buffer
                    String respuesta = scanner.nextLine().toLowerCase();

                    if (respuesta.equals("s") || respuesta.equals("si")) {
                        entradaValida = true;
                    } else {
                        System.out.println("Operación cancelada.\n");
                        continue;
                    }
                } else {
                    entradaValida = true;
                }

            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número entero. Intenta de nuevo.\n");
                scanner.nextLine(); // Limpiar buffer
            }
        }

        return n;
    }
}