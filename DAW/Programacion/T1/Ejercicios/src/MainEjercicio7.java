public class MainEjercicio7 {

    /*
    Ejercicio 7: Presentación personal
    Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad) en variables y muestre un mensaje de presentación por consola.
    Ejemplo de salida por consola:
    ¡Hola! Me llamo Elena García.
    Tengo 24 años y vivo en Barcelona.
    */

    public static void main(String[] args) {
        String nombre="Miguel Montes.";
        int edad= 42;
        String ciudad="Madrid.";

        System.out.println("¡Hola! Me llamo " + nombre);
        System.out.println("Tengo " +edad+ " años y vivo en " +ciudad);
    }
}
