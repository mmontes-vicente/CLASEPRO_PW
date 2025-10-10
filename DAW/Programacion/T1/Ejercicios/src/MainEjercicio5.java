public class MainEjercicio5 {

    /*
    Crea un programa que use constantes para almacenar información que no debe cambiar
    (como el valor de PI o el nombre de una aplicación) y variables para información que puede
    cambiar. Muestra todos los valores.
    Ejemplo de salida por consola:
    Aplicación: MiApp
    Versión: 1.0.0
    Valor de PI: 3.14159
    Usuario actual: Laura
    Nivel: 1
    Puntuación: 0
    Usuario actualizado: Miguel
    Nivel actualizado: 2
    Puntuación actualizada: 150
    */

    public static void main(String[] args) {

        String usuario="Laura";
        final String aplicacion="MiApp";
        String version = "1.0.0";
        int nivel= 1;
        int puntuacion= 0;

        System.out.println("Aplicación: "+ aplicacion);
        System.out.println("Versión: "+ version);
        System.out.println("Valor de PI: "+Math.PI);
        System.out.println("Usuario actual: "+ usuario);
        System.out.println("Nivel: "+ nivel);
        System.out.println("Puntuación: "+ puntuacion+"\n");

        usuario ="Miguel";
        nivel= 2;
        puntuacion= 150;

        System.out.println("Usuario actualizado: "+ usuario);
        System.out.println("Nivel actualizado: "+ nivel);
        System.out.println("Puntuación actualizado: "+ puntuacion);
    }
}
