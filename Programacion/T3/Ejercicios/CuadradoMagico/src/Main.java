import model.CuadradoMagico;
import utils.GeneradorCuadradoMagico;
import utils.ValidadorCuadradoMagico;
import utils.EntradaDatos;
import utils.FormateadorSalida;

/**
 * Clase principal del programa de generación de cuadrados mágicos.
 * Coordina la entrada de datos, generación y validación del cuadrado mágico.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== GENERADOR DE CUADRADOS MÁGICOS ===\n");

        // Solicitar tamaño de la matriz
        int n = EntradaDatos.solicitarTamanoMatriz();

        // Crear generador y validador
        GeneradorCuadradoMagico generador = new GeneradorCuadradoMagico(n);
        ValidadorCuadradoMagico validador = new ValidadorCuadradoMagico();

        // Buscar cuadrado mágico
        System.out.println("\nBuscando cuadrado mágico...");
        System.out.println("(Esto puede tomar tiempo dependiendo del tamaño)\n");

        CuadradoMagico cuadrado = null;
        int intentos = 0;
        long tiempoInicio = System.currentTimeMillis();

        while (cuadrado == null) {
            intentos++;
            CuadradoMagico candidato = generador.generar();

            if (validador.esValido(candidato)) {
                cuadrado = candidato;
            }

            // Mostrar progreso cada 1000 intentos
            if (intentos % 1000 == 0) {
                System.out.println("Intentos realizados: " + intentos);
            }
        }

        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;

        // Mostrar resultado
        FormateadorSalida.mostrarResultado(cuadrado, intentos, tiempoTotal);
    }
}