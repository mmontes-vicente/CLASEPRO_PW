package model;

/**
 * Representa un cuadrado mágico con su matriz de valores
 * y su constante mágica.
 */
public class CuadradoMagico {
    private int[][] matriz;
    private int tamano;
    private int constanteMagica;

    /**
     * Constructor del cuadrado mágico.
     * @param matriz Matriz de enteros que representa el cuadrado
     */
    public CuadradoMagico(int[][] matriz) {
        this.matriz = matriz;
        this.tamano = matriz.length;
        this.constanteMagica = calcularConstanteMagica();
    }

    /**
     * Calcula la constante mágica sumando la primera fila.
     * @return La suma de los elementos de la primera fila
     */
    private int calcularConstanteMagica() {
        int suma = 0;
        for (int j = 0; j < tamano; j++) {
            suma += matriz[0][j];
        }
        return suma;
    }

    /**
     * Obtiene el elemento en la posición especificada.
     * @param fila Índice de la fila
     * @param columna Índice de la columna
     * @return El valor en la posición especificada
     */
    public int getElemento(int fila, int columna) {
        return matriz[fila][columna];
    }

    /**
     * Obtiene la matriz completa.
     * @return La matriz del cuadrado mágico
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * Obtiene el tamaño del cuadrado.
     * @return El tamaño n del cuadrado n×n
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Obtiene la constante mágica.
     * @return El valor de la constante mágica
     */
    public int getConstanteMagica() {
        return constanteMagica;
    }

    /**
     * Calcula la suma de una fila específica.
     * @param fila Índice de la fila
     * @return La suma de los elementos de la fila
     */
    public int getSumaFila(int fila) {
        int suma = 0;
        for (int j = 0; j < tamano; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    /**
     * Calcula la suma de una columna específica.
     * @param columna Índice de la columna
     * @return La suma de los elementos de la columna
     */
    public int getSumaColumna(int columna) {
        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    /**
     * Calcula la suma de la diagonal principal.
     * @return La suma de los elementos de la diagonal principal
     */
    public int getSumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    /**
     * Calcula la suma de la diagonal secundaria.
     * @return La suma de los elementos de la diagonal secundaria
     */
    public int getSumaDiagonalSecundaria() {
        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += matriz[i][tamano - 1 - i];
        }
        return suma;
    }
}