public class MainEjercicio9 {

    /*Ejercicio 9: Información de un producto
Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad)
y muestre estos datos formateados por consola.
Ejemplo de salida por consola:
INFORMACIÓN DEL PRODUCTO
--------------------------
Nombre: Auriculares Bluetooth
Precio: 29.99€
Código: AUR-2023
Disponible: true*/

    public static void main(String[] args) {
        System.out.println("INFORMACIÓN DEL PRODUCTO\n" +
                "--------------------------");

        String nombre="Auriculares Bluetooth";
        float precio= 29.99f;
        char euro= '€';
        String codigo="AUR-2023";
        boolean disponible= true;

        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Código: "+ codigo);
        System.out.println("Disponible: "+ disponible);
    }
}
