package servicio;

import modelo.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {

    private List<Trabajador> trabajadores;

    public GestorUsuarios() {
        this.trabajadores = new ArrayList<>();
        // Trabajador de ejemplo precargado
        trabajadores.add(new Trabajador("Ana", "García", "11111111A", "ana@empresa.com", "1234"));
    }

    public boolean altaTrabajador(String nombre, String apellido, String dni, String correo, String contrasena) {
        if (buscarPorDni(dni) != null) {
            return false;
        }
        trabajadores.add(new Trabajador(nombre, apellido, dni, correo, contrasena));
        return true;
    }

    public boolean bajaTrabajador(String dni) {
        Trabajador t = buscarPorDni(dni);
        if (t == null) return false;
        trabajadores.remove(t);
        return true;
    }

    public Trabajador verDatosTrabajador(String dni) {
        return buscarPorDni(dni);
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public boolean cambiarContrasena(String dni, String nuevaContrasena) {
        Trabajador t = buscarPorDni(dni);
        if (t == null) return false;
        t.setContrasena(nuevaContrasena);
        return true;
    }

    public Trabajador autenticarTrabajador(String correo, String contrasena) {
        for (Trabajador t : trabajadores) {
            if (t.getCorreo().equalsIgnoreCase(correo) && t.getContrasena().equals(contrasena)) {
                return t;
            }
        }
        return null;
    }

    private Trabajador buscarPorDni(String dni) {
        for (Trabajador t : trabajadores) {
            if (t.getDni().equalsIgnoreCase(dni)) return t;
        }
        return null;
    }
}
