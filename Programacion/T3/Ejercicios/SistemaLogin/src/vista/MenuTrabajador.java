package vista;

public class MenuTrabajador {

    private final MenuLogin menuLogin;

    public MenuTrabajador(MenuLogin menuLogin) {
        this.menuLogin = menuLogin;
    }

    public int mostrarMenu(String nombre, String apellido) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║           MENÚ TRABAJADOR            ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("  Hola, " + nombre + " " + apellido);
        System.out.println();
        System.out.println("  1. Realizar fichaje");
        System.out.println("  0. Cerrar sesión");
        return menuLogin.leerOpcion(0, 1);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
