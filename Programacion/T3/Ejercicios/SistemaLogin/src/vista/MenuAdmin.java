package vista;

public class MenuAdmin {

    private final MenuLogin menuLogin;

    public MenuAdmin(MenuLogin menuLogin) {
        this.menuLogin = menuLogin;
    }

    public int mostrarMenu() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║         MENÚ ADMINISTRADOR           ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("  1. Dar de alta un trabajador");
        System.out.println("  2. Dar de baja un trabajador");
        System.out.println("  3. Ver datos de un trabajador");
        System.out.println("  4. Ver todos los trabajadores");
        System.out.println("  5. Cambiar contraseña de un trabajador");
        System.out.println("  6. Ver registros de jornada (fichajes)");
        System.out.println("  0. Cerrar sesión");
        return menuLogin.leerOpcion(0, 6);
    }

    public String[] pedirDatosAlta() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║         ALTA DE TRABAJADOR           ║");
        System.out.println("╚══════════════════════════════════════╝");
        String nombre     = menuLogin.leerCadena("  Nombre:      ");
        String apellido   = menuLogin.leerCadena("  Apellido:    ");
        String dni        = menuLogin.leerCadena("  DNI:         ");
        String correo     = menuLogin.leerCadena("  Correo:      ");
        String contrasena = menuLogin.leerCadena("  Contraseña:  ");
        return new String[]{nombre, apellido, dni, correo, contrasena};
    }

    public String pedirDni(String accion) {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.printf( "║  %-36s║%n", accion);
        System.out.println("╚══════════════════════════════════════╝");
        return menuLogin.leerCadena("  DNI del trabajador: ");
    }

    public String[] pedirDniYContrasena() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║         CAMBIAR CONTRASEÑA           ║");
        System.out.println("╚══════════════════════════════════════╝");
        String dni            = menuLogin.leerCadena("  DNI del trabajador:  ");
        String nuevaContrasena = menuLogin.leerCadena("  Nueva contraseña:    ");
        return new String[]{dni, nuevaContrasena};
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarRegistros(String registros) {
        System.out.println("\n========== REGISTROS DE JORNADA ==========");
        if (registros == null) {
            System.out.println("  (No hay registros de fichaje todavía)");
        } else {
            System.out.print(registros);
        }
        System.out.println("==========================================");
    }
}
