public class MainEjercicio6 {
    /*
    Ejercicio6: Operaciones aritméticas simples
    Escribe un programa que declare dos variables numéricas, realice las operaciones básicas
    (suma, resta, multiplicación y división) y muestre los resultados por consola.

    Ejemplo de salida por consola:
    Número 1: 10
    Número 2: 5
    Suma: 15
    Resta: 5
    Multiplicación: 50
    División: 2
     */

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        System.out.println("Número1: "+numero1);
        System.out.println("Número2: "+numero2);
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);
    }
}
