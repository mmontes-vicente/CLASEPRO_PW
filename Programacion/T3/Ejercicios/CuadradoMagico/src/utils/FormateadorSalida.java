package utils;

import model.CuadradoMagico;

/**
 * Clase utilidad para formatear y mostrar la salida del programa.
 */
public class FormateadorSalida {

    /**
     * Muestra el resultado del cuadrado mágico encontrado.
     * @param cuadrado El cuadrado mágico encontrado
     * @param intentos Número de intentos realizados
     * @param tiempoMs Tiempo transcurrido en milisegundos
     */
    public static void mostrarResultado(CuadradoMagico cuadrado, int intentos, long tiempoMs) {
        System.out.println("\n=== CUADRADO MÁGICO ENCONTRADO ===\n");

        // Mostrar la matriz
        mostrarMatriz(cuadrado);

        // Mostrar información adicional
        System.out.println("\nConstante mágica: " + cuadrado.getConstanteMagica());
        System.out.println("Intentos realizados: " + intentos);
        System.out.println("Tiempo transcurrido: " + formatearTiempo(tiempoMs));

        // Mostrar verificación
        System.out.println("\n=== VERIFICACIÓN ===");
        mostrarVerificacion(cuadrado);
    }

    /**
     * Muestra la matriz con formato alineado.
     * @param cuadrado El cuadrado mágico a mostrar
     */
    private static void mostrarMatriz(CuadradoMagico cuadrado) {
        int tamano = cuadrado.getTamano();
        int[][] matriz = cuadrado.getMatriz();

        // Calcular el ancho máximo necesario para alinear columnas
        int anchoMaximo = calcularAnchoMaximo(matriz);

        // Mostrar matriz con alineación
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.printf("%" + anchoMaximo + "d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Calcula el ancho máximo necesario para alinear los números.
     * @param matriz La matriz a analizar
     * @return El número de dígitos del número más grande
     */
    private static int calcularAnchoMaximo(int[][] matriz) {
        int max = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                max = Math.max(max, valor);
            }
        }
        return String.valueOf(max).length();
    }

    /**
     * Muestra la verificación detallada de filas, columnas y diagonales.
     * @param cuadrado El cuadrado mágico a verificar
     */
    private static void mostrarVerificacion(CuadradoMagico cuadrado) {
        int tamano = cuadrado.getTamano();
        int constanteMagica = cuadrado.getConstanteMagica();

        // Verificar filas
        System.out.println("\nSuma de filas:");
        for (int i = 0; i < tamano; i++) {
            int suma = cuadrado.getSumaFila(i);
            String check = (suma == constanteMagica) ? "✓" : "✗";
            System.out.printf("  Fila %d: %d %s\n", i + 1, suma, check);
        }

        // Verificar columnas
        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < tamano; j++) {
            int suma = cuadrado.getSumaColumna(j);
            String check = (suma == constanteMagica) ? "✓" : "✗";
            System.out.printf("  Columna %d: %d %s\n", j + 1, suma, check);
        }

        // Verificar diagonales
        System.out.println("\nSuma de diagonales:");
        int sumaDiagPrincipal = cuadrado.getSumaDiagonalPrincipal();
        String checkDiagPrincipal = (sumaDiagPrincipal == constanteMagica) ? "✓" : "✗";
        System.out.printf("  Diagonal principal: %d %s\n", sumaDiagPrincipal, checkDiagPrincipal);

        int sumaDiagSecundaria = cuadrado.getSumaDiagonalSecundaria();
        String checkDiagSecundaria = (sumaDiagSecundaria == constanteMagica) ? "✓" : "✗";
        System.out.printf("  Diagonal secundaria: %d %s\n", sumaDiagSecundaria, checkDiagSecundaria);
    }

    /**
     * Formatea el tiempo en milisegundos a un formato legible.
     * @param tiempoMs Tiempo en milisegundos
     * @return Cadena formateada con el tiempo
     */
    private static String formatearTiempo(long tiempoMs) {
        if (tiempoMs < 1000) {
            return tiempoMs + " ms";
        } else if (tiempoMs < 60000) {
            return String.format("%.2f segundos", tiempoMs / 1000.0);
        } else {
            long minutos = tiempoMs / 60000;
            long segundos = (tiempoMs % 60000) / 1000;
            return String.format("%d min %d seg", minutos, segundos);
        }
    }
}