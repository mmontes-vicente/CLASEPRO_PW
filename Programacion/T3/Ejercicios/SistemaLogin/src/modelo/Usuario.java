package modelo;

public abstract class Usuario {

    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String apellido, String dni, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public abstract String getTipoUsuario();

    @Override
    public String toString() {
        return "Nombre:  " + nombre + " " + apellido +
               "\nDNI:     " + dni +
               "\nCorreo:  " + correo +
               "\nTipo:    " + getTipoUsuario();
    }
}
