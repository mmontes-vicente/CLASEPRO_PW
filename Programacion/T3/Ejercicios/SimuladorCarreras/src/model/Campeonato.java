package model;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nombre;
    private List<Coche> coches;
    private List<Carrera> carreras;

    public Campeonato(String nombre, List<Coche> coches) {
        this.nombre = nombre;
        this.coches = new ArrayList<>(coches);
        this.carreras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}