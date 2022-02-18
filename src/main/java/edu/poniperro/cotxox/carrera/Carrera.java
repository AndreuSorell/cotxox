package edu.poniperro.cotxox.carrera;

import java.util.Optional;

import edu.poniperro.cotxox.conductores.Conductor;
import edu.poniperro.cotxox.conductores.PoolConductores;

public class Carrera {
    private double tiempoEsperado;
    private double tiempoCarrera;
    private double costeTotal;
    private Conductor conductor;
    private double propina;
    private String tarjetaCredito;
    private String origen;    
    private String destino;
    private double costeEsperado;
    private double distancia;

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public double getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(double tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
    
    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public double getCosteEsperado() {
        return costeEsperado;
    }
    
    public void setCosteEsperado(double costeEsperado) {
        this.costeEsperado = costeEsperado;
    }
    
    public double getDistancia() {
        return distancia;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public void asignarConductor(PoolConductores conductores) {
        Optional<Conductor> conductor = conductores.asignarConductor();
        if (conductor.isPresent()) {
            setConductor(conductor.get());
        }
    }
    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    public void realizarPago(double pago) {
        costeTotal = pago;
    }

    public void recibirPropina(double propina) {
        this.propina = propina; 
    }

    public void liberarConductor() {
        // pendiente
    }
}
