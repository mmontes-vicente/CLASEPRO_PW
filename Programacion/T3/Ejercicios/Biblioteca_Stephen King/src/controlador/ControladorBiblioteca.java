package controlador;

import modelo.Biblioteca;
import modelo.Libro;

import java.util.List;

public class ControladorBiblioteca {

    private final Biblioteca biblioteca;
    private final ControladorAPI controladorAPI;

    public ControladorBiblioteca() {
        this.biblioteca = new Biblioteca();
        this.controladorAPI = new ControladorAPI();
    }

    public boolean importarLibros() {
        try {
            System.out.println("Conectando con la API de Stephen King...");
            List<Libro> libros = controladorAPI.obtenerTodosLosLibros();
            biblioteca.setLibros(libros);
            System.out.println("Se importaron " + libros.size() + " libros correctamente.");
            return true;
        } catch (Exception e) {
            System.out.println("Error al importar libros: " + e.getMessage());
            return false;
        }
    }

    public Libro buscarLibroPorId(int id) {
        try {
            System.out.println("Buscando libro con ID " + id + " en la API...");
            Libro libro = controladorAPI.obtenerLibroPorId(id);
            if (libro != null) {
                System.out.println("Libro encontrado.");
            }
            return libro;
        } catch (Exception e) {
            System.out.println("Error al buscar el libro: " + e.getMessage());
            return null;
        }
    }

    public boolean agregarFavorito(int id) {
        if (biblioteca.getLibros().isEmpty()) {
            System.out.println("Primero debes importar los libros (opcion 1).");
            return false;
        }
        Libro libro = biblioteca.buscarPorId(id);
        if (libro == null) {
            System.out.println("No se encontro ningun libro con ID " + id + ".");
            return false;
        }
        biblioteca.agregarFavorito(libro);
        System.out.println("\"" + libro.getTitulo() + "\" añadido a favoritos.");
        return true;
    }

    public void mostrarTodosLosLibros() {
        List<Libro> libros = biblioteca.getLibros();
        if (libros.isEmpty()) {
            System.out.println("No hay libros importados. Usa la opcion 1 primero.");
            return;
        }
        System.out.println("--- CATALOGO DE LIBROS (" + libros.size() + " libros) ---");
        for (Libro l : libros) {
            System.out.printf("[%3d] %s (%d)%n", l.getId(), l.getTitulo(), l.getAnio());
        }
    }

    public void mostrarFavoritos() {
        List<Libro> favoritos = biblioteca.getFavoritos();
        if (favoritos.isEmpty()) {
            System.out.println("No tienes libros favoritos todavia.");
            return;
        }
        System.out.println("--- LIBROS FAVORITOS (" + favoritos.size() + " libros) ---");
        for (Libro l : favoritos) {
            System.out.println(l);
        }
    }

    public Biblioteca getBiblioteca() { return biblioteca; }

    public void setFavoritosImportados(List<Libro> favoritos) {
        biblioteca.setFavoritos(favoritos);
    }
}
