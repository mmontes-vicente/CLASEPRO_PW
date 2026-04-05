package controller;

import model.Libro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileController {

    private String nombreFichero = "favoritos.obj";

    public boolean exportarFavoritos(List<Libro> favoritos) {
        if (favoritos.size() == 0) {
            System.out.println("No hay favoritos para exportar.");
            return false;
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.writeObject(new ArrayList<Libro>(favoritos));
            oos.close();
            System.out.println("Se exportaron " + favoritos.size() + " favorito(s) en el fichero " + nombreFichero);
            return true;
        } catch (Exception e) {
            System.out.println("Error al exportar: " + e.getMessage());
            return false;
        }
    }

    public List<Libro> importarFavoritos() {
        File fichero = new File(nombreFichero);

        if (fichero.exists() == false) {
            System.out.println("No existe el fichero " + nombreFichero + ". Exporta favoritos primero (opcion 4).");
            return new ArrayList<Libro>();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            List<Libro> favoritos = (List<Libro>) ois.readObject();
            ois.close();
            System.out.println("Se cargaron " + favoritos.size() + " favorito(s) desde " + nombreFichero);
            return favoritos;
        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
            return new ArrayList<Libro>();
        }
    }
}
