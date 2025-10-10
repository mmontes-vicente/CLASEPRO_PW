public class MinEjercicio10 {

    /*Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
    Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
La fórmula para convertir de Celsius a Fahrenheit es:
F = C × 9/5 + 32
Ejemplo de salida por consola:
Temperatura en Celsius: 25
Temperatura en Fahrenheit: 77*/

    public static void main(String[] args) {
        int celsius= 25;

        int fahrenheit = celsius * 9/5 + 32;

        System.out.println("Temperatura en Celsius: " +celsius);
        System.out.println("Temperatura en Fahrenheit: " +fahrenheit);
    }
}
