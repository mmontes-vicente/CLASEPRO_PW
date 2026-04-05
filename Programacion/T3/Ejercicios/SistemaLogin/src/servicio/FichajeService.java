package servicio;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FichajeService {

    // Guarda horas.txt en el escritorio del usuario, siempre tiene permisos
    private static final String FICHERO_HORAS =
            System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "horas.txt";

    public boolean registrarFichaje(String correo) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String fechaHora = ahora.format(formato);
        String registro = correo + " - " + fechaHora;

        File fichero = new File(FICHERO_HORAS);

        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
            return false;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero, true))) {
            writer.write(registro);
            writer.newLine();
            System.out.println("Fichaje registrado correctamente.");
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir el fichaje: " + e.getMessage());
            return false;
        }
    }

    public String leerRegistros() {
        File fichero = new File(FICHERO_HORAS);

        if (!fichero.exists() || fichero.length() == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append("  ").append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return null;
        }
        return sb.toString();
    }
}
