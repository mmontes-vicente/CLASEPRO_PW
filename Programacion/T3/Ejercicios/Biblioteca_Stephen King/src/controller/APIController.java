package controller;

import model.Libro;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class APIController {

    private static final String URL_BASE = "https://stephen-king-api.onrender.com/api";

    public List<Libro> obtenerTodosLosLibros() throws Exception {
        String respuesta = hacerPeticion(URL_BASE + "/books");
        return parsearListaLibros(respuesta);
    }

    public Libro obtenerLibroPorId(int id) throws Exception {
        String respuesta = hacerPeticion(URL_BASE + "/book/" + id);
        return parsearUnLibro(respuesta);
    }

    private String hacerPeticion(String urlStr) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setConnectTimeout(15000);
        conexion.setReadTimeout(15000);

        int codigo = conexion.getResponseCode();
        if (codigo != HttpURLConnection.HTTP_OK) {
            throw new Exception("Error en la API. Codigo HTTP: " + codigo);
        }

        BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        String respuesta = "";
        while ((linea = lector.readLine()) != null) {
            respuesta = respuesta + linea;
        }
        lector.close();
        conexion.disconnect();
        return respuesta;
    }

    private List<Libro> parsearListaLibros(String json) {
        List<Libro> libros = new ArrayList<Libro>();
        JSONObject raiz = new JSONObject(json);
        JSONArray datos = raiz.getJSONArray("data");

        for (int i = 0; i < datos.length(); i++) {
            libros.add(parsearObjeto(datos.getJSONObject(i)));
        }
        return libros;
    }

    private Libro parsearUnLibro(String json) {
        JSONObject raiz = new JSONObject(json);
        JSONObject datos = raiz.getJSONObject("data");
        return parsearObjeto(datos);
    }

    private Libro parsearObjeto(JSONObject obj) {
        Libro libro = new Libro();

        if (obj.has("id")) {
            libro.setId(obj.optInt("id", 0));
        } else if (obj.has("bookId")) {
            libro.setId(obj.optInt("bookId", 0));
        }

        if (obj.has("title") && !obj.optString("title").isEmpty()) {
            libro.setTitulo(obj.optString("title"));
        } else if (obj.has("Title") && !obj.optString("Title").isEmpty()) {
            libro.setTitulo(obj.optString("Title"));
        } else if (obj.has("name") && !obj.optString("name").isEmpty()) {
            libro.setTitulo(obj.optString("name"));
        } else {
            libro.setTitulo("Sin titulo");
        }

        if (obj.has("year")) {
            libro.setAnio(obj.optInt("year", 0));
        } else if (obj.has("Year")) {
            libro.setAnio(obj.optInt("Year", 0));
        }

        libro.setHandle(obj.optString("handle", ""));

        if (obj.has("publisher") && !obj.optString("publisher").isEmpty()) {
            libro.setEditorial(obj.optString("publisher"));
        } else if (obj.has("Publisher") && !obj.optString("Publisher").isEmpty()) {
            libro.setEditorial(obj.optString("Publisher"));
        } else {
            libro.setEditorial("N/A");
        }

        if (obj.has("isbn") && !obj.optString("isbn").isEmpty()) {
            libro.setIsbn(obj.optString("isbn"));
        } else if (obj.has("ISBN") && !obj.optString("ISBN").isEmpty()) {
            libro.setIsbn(obj.optString("ISBN"));
        } else {
            libro.setIsbn("N/A");
        }

        if (obj.has("pages") && !obj.optString("pages").isEmpty()) {
            libro.setPaginas(obj.optString("pages"));
        } else if (obj.has("Pages") && !obj.optString("Pages").isEmpty()) {
            libro.setPaginas(obj.optString("Pages"));
        } else {
            libro.setPaginas("N/A");
        }

        List<String> villanos = new ArrayList<String>();
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

        List<String> notas = new ArrayList<String>();
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