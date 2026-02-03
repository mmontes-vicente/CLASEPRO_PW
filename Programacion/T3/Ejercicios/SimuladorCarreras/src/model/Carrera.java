package model;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private int numeroCarrera;
    private double kmTotales;
    private List<Coche> participantes;
    private List<Coche> resultados;

    public Carrera(int numeroCarrera, double kmTotales, List<Coche> participantes) {
        this.numeroCarrera = numeroCarrera;
        this.kmTotales = kmTotales;
        this.participantes = new ArrayList<>(participantes);
        this.resultados = new ArrayList<>();
    }

    public int getNumeroCarrera() {
        return numeroCarrera;
    }

    public double getKmTotales() {
        return kmTotales;
    }

    public List<Coche> getParticipantes() {
        return participantes;
    }

    public List<Coche> getResultados() {
        return resultados;
    }

    public void setResultados(List<Coche> resultados) {
        this.resultados = resultados;
    }

    public void prepararCoches() {
        for (Coche coche : participantes) {
            coche.resetearKm();
        }
    }
}