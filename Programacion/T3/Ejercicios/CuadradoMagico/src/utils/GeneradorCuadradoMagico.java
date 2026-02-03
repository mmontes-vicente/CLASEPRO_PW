package utils;

import model.CuadradoMagico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase encargada de generar matrices aleatorias para intentar
 * formar cuadrados mágicos.
 */
public class GeneradorCuadradoMagico {
    private int tamano;
    private int rangoInicio;
    private int rangoFin;

    /**
     * Constructor del generador.
     * @param tamano Tamaño del cuadrado (n×n)
     */
    public GeneradorCuadradoMagico(int tamano) {
        this.tamano = tamano;
        // Generar números desde 1 hasta n²
        this.rangoInicio = 1;
        this.rangoFin = tamano * tamano;
    }

    /**
     * Constructor con rango personalizado.
     * @param tamano Tamaño del cuadrado
     * @param rangoInicio Primer número del rango
     * @param rangoFin Último número del rango
     */
    public GeneradorCuadradoMagico(int tamano, int rangoInicio, int rangoFin) {
        this.tamano = tamano;
        this.rangoInicio = rangoInicio;
        this.rangoFin = rangoFin;
    }

    /**
     * Genera un nuevo cuadrado con números aleatorios sin repetición.
     * @return Un nuevo CuadradoMagico con valores aleatorios
     */
    public CuadradoMagico generar() {
        // Crear lista con números del rango
        List<Integer> numeros = generarListaNumeros();

        // Mezclar aleatoriamente
        Collections.shuffle(numeros);

        // Crear matriz
        int[][] matriz = new int[tamano][tamano];
        int indice = 0;

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = numeros.get(indice);
                indice++;
            }
        }

        return new CuadradoMagico(matriz);
    }

    /**
     * Genera una lista con todos los números del rango especificado.
     * @return Lista de enteros sin repetición
     */
    private List<Integer> generarListaNumeros() {
        List<Integer> numeros = new ArrayList<>();

        // Necesitamos exactamente tamano² números
        int cantidadNecesaria = tamano * tamano;

        // Si el rango es suficiente, tomar los primeros números
        if (rangoFin - rangoInicio + 1 >= cantidadNecesaria) {
            for (int i = rangoInicio; i < rangoInicio + cantidadNecesaria; i++) {
                numeros.add(i);
            }
        } else {
            // Si no hay suficientes números, usar todo el rango disponible
            for (int i = rangoInicio; i <= rangoFin; i++) {
                numeros.add(i);
            }
        }

        return numeros;
    }

    /**
     * Obtiene el tamaño del cuadrado.
     * @return El tamaño n
     */
    public int getTamano() {
        return tamano;
    }
}