public class MainEjercicio3 {
    /*
Ejercicio 3: Tipos de variables
Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
Ejemplo de salida por consola:
Nombre: Carlos - Tipo: String
Edad: 30 - Tipo: int
¿Es estudiante?: true - Tipo: boolean
Altura: 1.75 - Tipo: double
Inicial: C - Tipo: char
*/



    public static void main(String[] args) {
        String nombre = "Carlos";
        int edad = 40;
        boolean estudiante = true;
        double altura = 1.75;
        char inicial= 'C';

        System.out.println("Nombre: "+nombre+ " - Tipo: String");
        System.out.println("Edad: "+edad+ " - Tipo: int");
        System.out.println("¿Es estudiante?: "+estudiante+ " - Tipo: boolean");
        System.out.println("Altura: "+altura+" - Tipo: double");
        System.out.println("Inicial: "+inicial+" - Tipo: char");
    }
}
