package vista;

import java.util.Scanner;

public class MenuLogin {

    private static final Scanner scanner = new Scanner(System.in);

    public void mostrarCabecera() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE LOGIN - EMPRESA       ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("  Introduce tus credenciales para acceder.");
    }

    public String pedirCorreo() {
        System.out.print("\n  Correo:      ");
        return scanner.nextLine().trim();
    }

    public String pedirContrasena() {
        System.out.print("  Contraseña:  ");
        return scanner.nextLine().trim();
    }

    public void mostrarBienvenida(String nombre, String tipo) {
        System.out.println("\n  Bienvenido/a, " + nombre + " (" + tipo + ")");
    }

    public void mostrarErrorCredenciales() {
        System.out.println("\n  Credenciales incorrectas. Intentalo de nuevo.");
    }

    public void mostrarAdios() {
        System.out.println("\n  Hasta luego. ¡Adiós!\n");
    }

    public int mostrarMenuSalir() {
        System.out.println("\n  ¿Deseas salir de la aplicación?");
        System.out.println("  1. Sí, salir");
        System.out.println("  0. No, volver al login");
        return leerOpcion(0, 1);
    }

    public void pausar() {
        System.out.print("\n  Pulsa ENTER para continuar...");
        scanner.nextLine();
    }

    public int leerOpcion(int min, int max) {
        int opcion = -1;
        while (opcion < min || opcion > max) {
            System.out.print("  Selecciona una opción (" + min + "-" + max + "): ");
            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
                if (opcion < min || opcion > max) {
                    System.out.println("  Opción fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("  Entrada no válida. Introduce un número.");
            }
        }
        return opcion;
    }

    public String leerCadena(String mensaje) {
        String valor;
        do {
            System.out.print(mensaje);
            valor = scanner.nextLine().trim();
            if (valor.isEmpty()) System.out.println("  El campo no puede estar vacío.");
        } while (valor.isEmpty());
        return valor;
    }
}
