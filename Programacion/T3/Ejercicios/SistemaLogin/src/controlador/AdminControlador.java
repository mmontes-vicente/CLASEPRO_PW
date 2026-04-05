package controlador;

import modelo.Trabajador;
import servicio.FichajeService;
import servicio.GestorUsuarios;
import vista.MenuAdmin;
import vista.MenuLogin;

import java.util.List;

public class AdminControlador {

    private final MenuAdmin menuAdmin;
    private final MenuLogin menuLogin;
    private final GestorUsuarios gestorUsuarios;
    private final FichajeService fichajeService;

    public AdminControlador(MenuAdmin menuAdmin, MenuLogin menuLogin,
                            GestorUsuarios gestorUsuarios, FichajeService fichajeService) {
        this.menuAdmin       = menuAdmin;
        this.menuLogin       = menuLogin;
        this.gestorUsuarios  = gestorUsuarios;
        this.fichajeService  = fichajeService;
    }

    public void ejecutar() {
        boolean volver = false;

        while (!volver) {
            int opcion = menuAdmin.mostrarMenu();

            switch (opcion) {
                case 1 -> altaTrabajador();
                case 2 -> bajaTrabajador();
                case 3 -> verDatosTrabajador();
                case 4 -> verTodosTrabajadores();
                case 5 -> cambiarContrasena();
                case 6 -> verRegistros();
                case 0 -> {
                    menuAdmin.mostrarMensaje("\n  Sesión cerrada.");
                    volver = true;
                }
            }
        }
    }

    private void altaTrabajador() {
        String[] datos = menuAdmin.pedirDatosAlta();
        boolean ok = gestorUsuarios.altaTrabajador(datos[0], datos[1], datos[2], datos[3], datos[4]);
        menuAdmin.mostrarMensaje(ok
                ? "\n  Trabajador dado de alta correctamente."
                : "\n  Ya existe un trabajador con ese DNI.");
        menuLogin.pausar();
    }

    private void bajaTrabajador() {
        String dni = menuAdmin.pedirDni("BAJA DE TRABAJADOR");
        boolean ok = gestorUsuarios.bajaTrabajador(dni);
        menuAdmin.mostrarMensaje(ok
                ? "\n  Trabajador dado de baja correctamente."
                : "\n  No se encontro ningun trabajador con ese DNI.");
        menuLogin.pausar();
    }

    private void verDatosTrabajador() {
        String dni = menuAdmin.pedirDni("DATOS DE TRABAJADOR");
        Trabajador t = gestorUsuarios.verDatosTrabajador(dni);
        if (t == null) {
            menuAdmin.mostrarMensaje("\n  No se encontro ningun trabajador con ese DNI.");
        } else {
            menuAdmin.mostrarMensaje("\n---------- DATOS DEL TRABAJADOR ----------");
            menuAdmin.mostrarMensaje(t.toString());
            menuAdmin.mostrarMensaje("------------------------------------------");
        }
        menuLogin.pausar();
    }

    private void verTodosTrabajadores() {
        List<Trabajador> lista = gestorUsuarios.getTrabajadores();
        if (lista.isEmpty()) {
            menuAdmin.mostrarMensaje("\n  (No hay trabajadores registrados)");
        } else {
            menuAdmin.mostrarMensaje("\n========== LISTA DE TRABAJADORES ==========");
            for (int i = 0; i < lista.size(); i++) {
                Trabajador t = lista.get(i);
                menuAdmin.mostrarMensaje("  [" + (i + 1) + "] " + t.getNombre() + " " + t.getApellido()
                        + " | DNI: " + t.getDni() + " | Correo: " + t.getCorreo());
            }
            menuAdmin.mostrarMensaje("===========================================");
        }
        menuLogin.pausar();
    }

    private void cambiarContrasena() {
        String[] datos = menuAdmin.pedirDniYContrasena();
        boolean ok = gestorUsuarios.cambiarContrasena(datos[0], datos[1]);
        menuAdmin.mostrarMensaje(ok
                ? "\n  Contrasena actualizada correctamente."
                : "\n  No se encontro ningun trabajador con ese DNI.");
        menuLogin.pausar();
    }

    private void verRegistros() {
        String registros = fichajeService.leerRegistros();
        menuAdmin.mostrarRegistros(registros);
        menuLogin.pausar();
    }
}
