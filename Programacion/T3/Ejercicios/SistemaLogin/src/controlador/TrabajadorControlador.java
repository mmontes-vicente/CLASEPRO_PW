package controlador;

import modelo.Trabajador;
import servicio.FichajeService;
import vista.MenuLogin;
import vista.MenuTrabajador;

public class TrabajadorControlador {

    private final MenuTrabajador menuTrabajador;
    private final MenuLogin menuLogin;
    private final FichajeService fichajeService;
    private final Trabajador trabajador;

    public TrabajadorControlador(MenuTrabajador menuTrabajador, MenuLogin menuLogin,
                                  FichajeService fichajeService, Trabajador trabajador) {
        this.menuTrabajador  = menuTrabajador;
        this.menuLogin       = menuLogin;
        this.fichajeService  = fichajeService;
        this.trabajador      = trabajador;
    }

    public void ejecutar() {
        boolean volver = false;

        while (!volver) {
            int opcion = menuTrabajador.mostrarMenu(trabajador.getNombre(), trabajador.getApellido());

            switch (opcion) {
                case 1 -> realizarFichaje();
                case 0 -> {
                    menuTrabajador.mostrarMensaje("\n  Sesión cerrada.");
                    volver = true;
                }
            }
        }
    }

    private void realizarFichaje() {
        boolean ok = fichajeService.registrarFichaje(trabajador.getCorreo());
        menuTrabajador.mostrarMensaje(ok
                ? "\n  Fichaje registrado correctamente."
                : "\n  Error al registrar el fichaje.");
        menuLogin.pausar();
    }
}
