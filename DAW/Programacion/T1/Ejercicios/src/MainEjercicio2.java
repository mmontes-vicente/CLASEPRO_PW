public class MainEjercicio2 {
    /*
    Ejercicio 2: Modificar variables
    Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.
    Ejemplo de salida por consola:
    Puntuación inicial: 0
    Después de primera modificación: 5
    Después de segunda modificación: 10
    Puntuación final: 15
       */

    public static void main(String[] args) {
        // Puntuación inicial
        int puntuacion = 0;

        System.out.println("Puntuación inicial:" +puntuacion);

        // Primera modificación
        puntuacion += +5;

        System.out.println("Después de primera modificación:" +puntuacion);

        // Segunda modificación
        puntuacion = puntuacion + 5;

        System.out.println("Después de segunda modificación:" +puntuacion);

        // Puntuación final
        puntuacion += 5;

        System.out.println("Puntuación final:" +puntuacion);
    }
}
