package edu.poniperro.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private List<Double> valoraciones = new ArrayList<Double>();
    private boolean ocupado;

    public Conductor() {

    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public void setValoracionMedia(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    public List<Double> getValoraciones() {
        return valoraciones;
    }

    public void setValoracion(double nuevaValoracion) {
        valoraciones.add(nuevaValoracion);
        actualizarValoracionMedia();
    }

    private void actualizarValoracionMedia() {
        double sum = valoraciones.stream().reduce(0.0, Double::sum);
        valoracionMedia = sum / valoraciones.size();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    
}
