package controlador;

import modelo.Libro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorFichero {

    private static final String FICHERO_FAVORITOS = "favoritos.obj";

    public boolean exportarFavoritos(List<Libro> favoritos) {
        if (favoritos == null || favoritos.isEmpty()) {
            System.out.println("No hay libros favoritos para exportar.");
            return false;
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(FICHERO_FAVORITOS))) {
            oos.writeObject(new ArrayList<>(favoritos));
            System.out.println("Se exportaron " + favoritos.size()
                    + " favorito(s) en el fichero " + FICHERO_FAVORITOS);
            return true;
        } catch (IOException e) {
            System.out.println("Error al exportar favoritos: " + e.getMessage());
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public List<Libro> importarFavoritos() {
        File fichero = new File(FICHERO_FAVORITOS);
        if (!fichero.exists()) {
            System.out.println("No existe el fichero " + FICHERO_FAVORITOS
                    + ". Exporta favoritos primero (opcion 4).");
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fichero))) {
            List<Libro> favoritos = (List<Libro>) ois.readObject();
            System.out.println("Se cargaron " + favoritos.size()
                    + " favorito(s) desde " + FICHERO_FAVORITOS);
            return favoritos;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al importar favoritos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
