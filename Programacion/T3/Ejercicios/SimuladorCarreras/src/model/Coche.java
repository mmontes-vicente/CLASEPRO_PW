package model;

public class Coche {
    private String marca;
    private String modelo;
    private int dorsal;
    private double kmRecorridos;
    private int puntosAcumulados;

    public Coche(String marca, String modelo, int dorsal) {
        this.marca = marca;
        this.modelo = modelo;
        this.dorsal = dorsal;
        this.kmRecorridos = 0;
        this.puntosAcumulados = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void incrementarKm(double km) {
        this.kmRecorridos += km;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void agregarPuntos(int puntos) {
        this.puntosAcumulados += puntos;
    }

    public void resetearKm() {
        this.kmRecorridos = 0;
    }

    public String getNombreCompleto() {
        return marca + " " + modelo;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Dorsal: %d)", marca, modelo, dorsal);
    }
}