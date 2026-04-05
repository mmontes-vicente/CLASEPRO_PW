package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;
    private List<Libro> favoritos;

    public Biblioteca() {
        libros = new ArrayList<Libro>();
        favoritos = new ArrayList<Libro>();
    }

    public List<Libro> getLibros() { return libros; }
    public void setLibros(List<Libro> libros) { this.libros = libros; }

    public List<Libro> getFavoritos() { return favoritos; }
    public void setFavoritos(List<Libro> favoritos) { this.favoritos = favoritos; }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarPorId(int id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                return libros.get(i);
            }
        }
        return null;
    }

    public void agregarFavorito(Libro libro) {
        boolean yaExiste = false;
        for (int i = 0; i < favoritos.size(); i++) {
            if (favoritos.get(i).getId() == libro.getId()) {
                yaExiste = true;
            }
        }
        if (yaExiste == false) {
            favoritos.add(libro);
        }
    }
}
