package modelo;

public class Administrador extends Usuario {

    private boolean privilegiosAdmin;

    public Administrador(String nombre, String apellido, String dni, String correo, String contrasena) {
        super(nombre, apellido, dni, correo, contrasena);
        this.privilegiosAdmin = true;
    }

    public boolean isPrivilegiosAdmin() { return privilegiosAdmin; }
    public void setPrivilegiosAdmin(boolean privilegiosAdmin) { this.privilegiosAdmin = privilegiosAdmin; }

    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrivilegios de Admin: " + privilegiosAdmin;
    }
}
