import controlador.AdminControlador;
import controlador.LoginControlador;
import controlador.TrabajadorControlador;
import modelo.Administrador;
import modelo.Trabajador;
import servicio.FichajeService;
import servicio.GestorUsuarios;
import vista.MenuAdmin;
import vista.MenuLogin;
import vista.MenuTrabajador;

public class Main {

    public static void main(String[] args) {

        // Modelo
        Administrador admin      = new Administrador("Carlos", "Martínez", "00000000A", "admin@empresa.com", "admin123");
        GestorUsuarios gestor    = new GestorUsuarios();
        FichajeService fichaje   = new FichajeService();

        // Vista
        MenuLogin menuLogin           = new MenuLogin();
        MenuAdmin menuAdmin           = new MenuAdmin(menuLogin);
        MenuTrabajador menuTrabajador = new MenuTrabajador(menuLogin);

        // Controlador de login
        LoginControlador loginControlador = new LoginControlador(menuLogin, gestor, admin);

        boolean salir = false;

        while (!salir) {
            Object sesion = loginControlador.iniciarSesion();

            if (sesion instanceof Administrador) {
                AdminControlador adminControlador = new AdminControlador(menuAdmin, menuLogin, gestor, fichaje);
                adminControlador.ejecutar();

            } else if (sesion instanceof Trabajador trabajador) {
                TrabajadorControlador trabajadorControlador = new TrabajadorControlador(menuTrabajador, menuLogin, fichaje, trabajador);
                trabajadorControlador.ejecutar();
            }

            if (sesion != null) {
                salir = menuLogin.mostrarMenuSalir() == 1;
            }
        }

        menuLogin.mostrarAdios();
    }
}
