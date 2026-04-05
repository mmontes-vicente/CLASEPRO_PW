package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Libro> libros;
    private List<Libro> favoritos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }

    public List<Libro> getLibros() { return libros; }
    public void setLibros(List<Libro> libros) { this.libros = libros; }

    public List<Libro> getFavoritos() { return favoritos; }
    public void setFavoritos(List<Libro> favoritos) { this.favoritos = favoritos; }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void agregarFavorito(Libro libro) {
        boolean yaExiste = favoritos.stream().anyMatch(f -> f.getId() == libro.getId());
        if (!yaExiste) {
            this.favoritos.add(libro);
        }
    }

    public Libro buscarPorId(int id) {
        return libros.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public int totalLibros() { return libros.size(); }
    public int totalFavoritos() { return favoritos.size(); }
}
