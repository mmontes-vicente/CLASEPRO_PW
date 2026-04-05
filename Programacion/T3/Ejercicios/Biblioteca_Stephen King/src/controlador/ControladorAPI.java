package controlador;

import modelo.Libro;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ControladorAPI {

    private static final String URL_BASE = "https://stephen-king-api.onrender.com/api";

    /**
     * Obtiene todos los libros de la API externa.
     */
    public List<Libro> obtenerTodosLosLibros() throws Exception {
        String respuestaJson = hacerPeticionGET(URL_BASE + "/books");
        return parsearListaLibros(respuestaJson);
    }

    /**
     * Obtiene un libro concreto por su ID.
     */
    public Libro obtenerLibroPorId(int id) throws Exception {
        String respuestaJson = hacerPeticionGET(URL_BASE + "/book/" + id);
        return parsearLibro(respuestaJson);
    }

    /**
     * Realiza una petición HTTP GET a la URL indicada.
     */
    private String hacerPeticionGET(String urlStr) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setConnectTimeout(15000);
        conexion.setReadTimeout(15000);
        conexion.setRequestProperty("Accept", "application/json");

        int codigo = conexion.getResponseCode();
        if (codigo != HttpURLConnection.HTTP_OK) {
            throw new Exception("Error en la API. Código HTTP: " + codigo);
        }

        BufferedReader lector = new BufferedReader(
                new InputStreamReader(conexion.getInputStream())
        );
        StringBuilder respuesta = new StringBuilder();
        String linea;
        while ((linea = lector.readLine()) != null) {
            respuesta.append(linea);
        }
        lector.close();
        conexion.disconnect();

        return respuesta.toString();
    }

    /**
     * Parsea el JSON con lista de libros.
     */
    private List<Libro> parsearListaLibros(String json) {
        List<Libro> libros = new ArrayList<>();
        JSONObject raiz = new JSONObject(json);
        JSONArray datos = raiz.getJSONArray("data");

        for (int i = 0; i < datos.length(); i++) {
            libros.add(parsearObjetoLibro(datos.getJSONObject(i)));
        }
        return libros;
    }

    /**
     * Parsea el JSON con un único libro.
     */
    private Libro parsearLibro(String json) {
        JSONObject raiz = new JSONObject(json);
        JSONObject datos = raiz.getJSONObject("data");
        return parsearObjetoLibro(datos);
    }

    /**
     * Convierte un JSONObject en un objeto Libro.
     */
    private Libro parsearObjetoLibro(JSONObject obj) {
        Libro libro = new Libro();
        libro.setId(obj.optInt("id", 0));
        libro.setTitulo(obj.optString("title", "Sin título"));
        libro.setAnio(obj.optInt("year", 0));
        libro.setHandle(obj.optString("handle", ""));
        libro.setEditorial(obj.optString("publisher", "N/A"));
        libro.setIsbn(obj.optString("isbn", "N/A"));
        libro.setPaginas(obj.optString("pages", "N/A"));

        // Villanos
        List<String> villanos = new ArrayList<>();
        if (obj.has("villains") && !obj.isNull("villains")) {
            JSONArray arr = obj.getJSONArray("villains");
            for (int j = 0; j < arr.length(); j++) {
                if (arr.get(j) instanceof JSONObject) {
                    villanos.add(arr.getJSONObject(j).optString("name", ""));
                } else {
                    villanos.add(arr.getString(j));
                }
            }
        }
        libro.setVillanos(villanos);

        // Notas
        List<String> notas = new ArrayList<>();
        if (obj.has("notes") && !obj.isNull("notes")) {
            JSONArray arr = obj.getJSONArray("notes");
            for (int j = 0; j < arr.length(); j++) {
                notas.add(arr.getString(j));
            }
        }
        libro.setNotas(notas);

        return libro;
    }
}
