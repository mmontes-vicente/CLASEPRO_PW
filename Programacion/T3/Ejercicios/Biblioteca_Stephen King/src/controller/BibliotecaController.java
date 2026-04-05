package controller;

import model.Biblioteca;
import model.Libro;

import java.util.List;

public class BibliotecaController {

    private Biblioteca biblioteca;
    private APIController apiController;

    public BibliotecaController() {
        biblioteca = new Biblioteca();
        apiController = new APIController();
    }

    public boolean importarLibros() {
        try {
            System.out.println("Conectando con la API de Stephen King...");
            List<Libro> libros = apiController.obtenerTodosLosLibros();
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
            System.out.println("Buscando libro con ID " + id + "...");
            Libro libro = apiController.obtenerLibroPorId(id);
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
        if (biblioteca.getLibros().size() == 0) {
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

        if (libros.size() == 0) {
            System.out.println("No hay libros importados. Usa la opcion 1 primero.");
            return;
        }

        System.out.println("--- CATALOGO DE LIBROS (" + libros.size() + " libros) ---");
        for (int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            System.out.println("[" + l.getId() + "] " + l.getTitulo() + " (" + l.getAnio() + ")");
        }
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setFavoritosImportados(List<Libro> favoritos) {
        biblioteca.setFavoritos(favoritos);
    }
}
