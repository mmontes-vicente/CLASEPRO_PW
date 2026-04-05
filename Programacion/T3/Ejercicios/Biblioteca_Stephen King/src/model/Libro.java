package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Serializable {

    private int id;
    private String titulo;
    private int anio;
    private String handle;
    private List<String> villanos;
    private List<String> notas;
    private String editorial;
    private String isbn;
    private String paginas;

    public Libro() {
        villanos = new ArrayList<String>();
        notas = new ArrayList<String>();
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

    public String toString() {
        return "ID        : " + id + "\n" +
               "Titulo    : " + titulo + "\n" +
               "Anio      : " + anio + "\n" +
               "Editorial : " + (editorial != null ? editorial : "N/A") + "\n" +
               "ISBN      : " + (isbn != null ? isbn : "N/A") + "\n" +
               "Paginas   : " + (paginas != null ? paginas : "N/A");
    }
}
