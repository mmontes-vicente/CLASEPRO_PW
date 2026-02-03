package utils;

import model.CuadradoMagico;

/**
 * Clase encargada de validar si un cuadrado cumple con
 * las propiedades de un cuadrado mágico.
 */
public class ValidadorCuadradoMagico {

    /**
     * Valida si el cuadrado es mágico verificando que todas las filas,
     * columnas y diagonales sumen la constante mágica.
     * @param cuadrado El cuadrado a validar
     * @return true sí es un cuadrado mágico válido, false en caso contrario
     */
    public boolean esValido(CuadradoMagico cuadrado) {
        int constanteMagica = cuadrado.getConstanteMagica();
        int tamano = cuadrado.getTamano();

        // Validar filas, columnas y diagonales
        return validarFilas(cuadrado, constanteMagica, tamano) &&
                validarColumnas(cuadrado, constanteMagica, tamano) &&
                validarDiagonalPrincipal(cuadrado, constanteMagica) &&
                validarDiagonalSecundaria(cuadrado, constanteMagica);
    }

    /**
     * Valida que todas las filas sumen la constante mágica.
     * @param cuadrado El cuadrado a validar
     * @param constanteMagica La constante mágica esperada
     * @param tamano El tamaño del cuadrado
     * @return true si todas las filas son válidas
     */
    private boolean validarFilas(CuadradoMagico cuadrado, int constanteMagica, int tamano) {
        for (int i = 0; i < tamano; i++) {
            if (cuadrado.getSumaFila(i) != constanteMagica) {
                return false;
            }
        }
        return true;
    }

    /**
     * Valida que todas las columnas sumen la constante mágica.
     * @param cuadrado El cuadrado a validar
     * @param constanteMagica La constante mágica esperada
     * @param tamano El tamaño del cuadrado
     * @return true si todas las columnas son válidas
     */
    private boolean validarColumnas(CuadradoMagico cuadrado, int constanteMagica, int tamano) {
        for (int j = 0; j < tamano; j++) {
            if (cuadrado.getSumaColumna(j) != constanteMagica) {
                return false;
            }
        }
        return true;
    }

    /**
     * Valida que la diagonal principal sume la constante mágica.
     * @param cuadrado El cuadrado a validar
     * @param constanteMagica La constante mágica esperada
     * @return true si la diagonal principal es válida
     */
    private boolean validarDiagonalPrincipal(CuadradoMagico cuadrado, int constanteMagica) {
        return cuadrado.getSumaDiagonalPrincipal() == constanteMagica;
    }

    /**
     * Valida que la diagonal secundaria sume la constante mágica.
     * @param cuadrado El cuadrado a validar
     * @param constanteMagica La constante mágica esperada
     * @return true si la diagonal secundaria es válida
     */
    private boolean validarDiagonalSecundaria(CuadradoMagico cuadrado, int constanteMagica) {
        return cuadrado.getSumaDiagonalSecundaria() == constanteMagica;
    }
}