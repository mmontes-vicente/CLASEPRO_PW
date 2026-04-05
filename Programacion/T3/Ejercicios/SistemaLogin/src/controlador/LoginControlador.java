package controlador;

import modelo.Administrador;
import modelo.Trabajador;
import servicio.GestorUsuarios;
import vista.MenuLogin;

public class LoginControlador {

    private final MenuLogin menuLogin;
    private final GestorUsuarios gestorUsuarios;
    private final Administrador admin;

    public LoginControlador(MenuLogin menuLogin, GestorUsuarios gestorUsuarios, Administrador admin) {
        this.menuLogin = menuLogin;
        this.gestorUsuarios = gestorUsuarios;
        this.admin = admin;
    }

    /**
     * Muestra el login y devuelve el usuario autenticado.
     * Devuelve el Administrador, un Trabajador, o null si falla.
     */
    public Object iniciarSesion() {
        menuLogin.mostrarCabecera();

        String correo     = menuLogin.pedirCorreo();
        String contrasena = menuLogin.pedirContrasena();

        // Comprueba si es administrador
        if (admin.getCorreo().equalsIgnoreCase(correo) &&
            admin.getContrasena().equals(contrasena)) {
            menuLogin.mostrarBienvenida(admin.getNombre(), "Administrador");
            return admin;
        }

        // Comprueba si es trabajador
        Trabajador t = gestorUsuarios.autenticarTrabajador(correo, contrasena);
        if (t != null) {
            menuLogin.mostrarBienvenida(t.getNombre(), "Trabajador");
            return t;
        }

        menuLogin.mostrarErrorCredenciales();
        return null;
    }
}
