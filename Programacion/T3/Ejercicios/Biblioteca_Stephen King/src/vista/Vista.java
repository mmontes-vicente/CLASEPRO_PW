package vista;

import controlador.ControladorBiblioteca;
import controlador.ControladorFichero;
import modelo.Libro;

import java.util.List;
import java.util.Scanner;

public class Vista {

    private final ControladorBiblioteca controladorBiblioteca;
    private final ControladorFichero controladorFichero;
    private final Scanner scanner;

    public Vista() {
        this.controladorBiblioteca = new ControladorBiblioteca();
        this.controladorFichero = new ControladorFichero();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        mostrarBienvenida();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero();

            switch (opcion) {
                case 1:
                    accionImportarLibros();
                    break;
                case 2:
                    accionBuscarLibro();
                    break;
                case 3:
                    accionAgregarFavorito();
                    break;
                case 4:
                    accionExportarFavoritos();
                    break;
                case 5:
                    accionImportarFavoritos();
                    break;
                case 6:
                    accionVerCatalogo();
                    break;
                case 0:
                    System.out.println("Hasta pronto.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Elige entre 0 y 6.");
                    break;
            }
        }
        scanner.close();
    }

    private void accionImportarLibros() {
        System.out.println();
        controladorBiblioteca.importarLibros();
        System.out.println();
    }

    private void accionBuscarLibro() {
        System.out.print("Introduce el ID del libro: ");
        int id = leerEntero();
        if (id < 0) {
            System.out.println("ID no valido.");
            return;
        }

        Libro libro = controladorBiblioteca.buscarLibroPorId(id);
        if (libro != null) {
            System.out.println();
            System.out.println(libro);
            if (libro.getVillanos() != null && !libro.getVillanos().isEmpty()) {
                System.out.println("Villanos : " + String.join(", ", libro.getVillanos()));
            }
            if (libro.getNotas() != null && !libro.getNotas().isEmpty()) {
                System.out.println("Notas    : " + String.join(" | ", libro.getNotas()));
            }
        }
        System.out.println();
    }

    private void accionAgregarFavorito() {
        System.out.print("Introduce el ID del libro que quieres marcar como favorito: ");
        int id = leerEntero();
        if (id < 0) {
            System.out.println("ID no valido.");
            return;
        }
        controladorBiblioteca.agregarFavorito(id);
        System.out.println();
    }

    private void accionExportarFavoritos() {
        System.out.println();
        List<Libro> favoritos = controladorBiblioteca.getBiblioteca().getFavoritos();
        controladorFichero.exportarFavoritos(favoritos);
        System.out.println();
    }

    private void accionImportarFavoritos() {
        System.out.println();
        List<Libro> favoritos = controladorFichero.importarFavoritos();
        if (!favoritos.isEmpty()) {
            controladorBiblioteca.setFavoritosImportados(favoritos);
            System.out.println("--- FAVORITOS IMPORTADOS ---");
            for (Libro l : favoritos) {
                System.out.println(l);
                System.out.println();
            }
        }
        System.out.println();
    }

    private void accionVerCatalogo() {
        System.out.println();
        controladorBiblioteca.mostrarTodosLosLibros();
        System.out.println();
    }

    private void mostrarBienvenida() {
        System.out.println("========================================");
        System.out.println("   BIBLIOTECA DE STEPHEN KING");
        System.out.println("   Gestion de libros desde API externa");
        System.out.println("========================================");
        System.out.println();
    }

    private void mostrarMenu() {
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Importar catalogo de libros");
        System.out.println("2. Buscar informacion de un libro");
        System.out.println("3. Añadir libro a favoritos");
        System.out.println("4. Exportar favoritos (.obj)");
        System.out.println("5. Importar favoritos (.obj)");
        System.out.println("6. Ver catalogo importado");
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
