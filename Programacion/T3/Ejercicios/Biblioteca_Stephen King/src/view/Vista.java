package view;

import controller.BibliotecaController;
import controller.FileController;
import model.Libro;

import java.util.List;
import java.util.Scanner;

public class Vista {

    private BibliotecaController bibliotecaController;
    private FileController fileController;
    private Scanner scanner;

    public Vista() {
        bibliotecaController = new BibliotecaController();
        fileController = new FileController();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = -1;

        while (opcion != 0) {
            mostrarMenu();
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("Conectando con la API...");
                    bibliotecaController.importarLibros();
                    break;
                case 2:
                    System.out.print("Introduce el ID del libro: ");
                    int idBuscar = leerEntero();
                    Libro libro = bibliotecaController.buscarLibroPorId(idBuscar);
                    if (libro != null) {
                        System.out.println();
                        System.out.println(libro);
                        if (libro.getVillanos() != null && libro.getVillanos().size() > 0) {
                            System.out.print("Villanos: ");
                            for (int i = 0; i < libro.getVillanos().size(); i++) {
                                System.out.print(libro.getVillanos().get(i));
                                if (i < libro.getVillanos().size() - 1) {
                                    System.out.print(", ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Introduce el ID del libro para añadir a favoritos: ");
                    int idFav = leerEntero();
                    bibliotecaController.agregarFavorito(idFav);
                    break;
                case 4:
                    List<Libro> favoritos = bibliotecaController.getBiblioteca().getFavoritos();
                    fileController.exportarFavoritos(favoritos);
                    break;
                case 5:
                    List<Libro> importados = fileController.importarFavoritos();
                    if (importados.size() > 0) {
                        bibliotecaController.setFavoritosImportados(importados);
                        System.out.println("--- FAVORITOS IMPORTADOS ---");
                        for (int i = 0; i < importados.size(); i++) {
                            System.out.println(importados.get(i).toString());
                            System.out.println();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion no valida. Elige entre 0 y 5.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Importar libros");
        System.out.println("2. Buscar informacion sobre un libro");
        System.out.println("3. Seleccionar un libro como favorito");
        System.out.println("4. Exportar libros favoritos");
        System.out.println("5. Importar favoritos");
        System.out.println("0. Salir");
        System.out.print("Elige una opcion: ");
    }

    private int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
