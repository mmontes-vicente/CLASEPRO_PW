package modelo;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String titulo;
    private int anio;
    private String handle;
    private List<String> villanos;
    private List<String> notas;
    private String editorial;
    private String isbn;
    private String paginas;

    public Libro() {}

    public Libro(int id, String titulo, int anio, String handle,
                 List<String> villanos, List<String> notas,
                 String editorial, String isbn, String paginas) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.handle = handle;
        this.villanos = villanos;
        this.notas = notas;
        this.editorial = editorial;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getHandle() { return handle; }
    public void setHandle(String handle) { this.handle = handle; }

    public List<String> getVillanos() { return villanos; }
    public void setVillanos(List<String> villanos) { this.villanos = villanos; }

    public List<String> getNotas() { return notas; }
    public void setNotas(List<String> notas) { this.notas = notas; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getPaginas() { return paginas; }
    public void setPaginas(String paginas) { this.paginas = paginas; }

    @Override
    public String toString() {
        return "ID        : " + id + "\n" +
               "Titulo    : " + titulo + "\n" +
               "Anio      : " + anio + "\n" +
               "Handle    : " + handle + "\n" +
               "Editorial : " + (editorial != null ? editorial : "N/A") + "\n" +
               "ISBN      : " + (isbn != null ? isbn : "N/A") + "\n" +
               "Paginas   : " + (paginas != null ? paginas : "N/A");
    }
}
