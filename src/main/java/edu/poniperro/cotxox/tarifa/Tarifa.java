package edu.poniperro.cotxox.tarifa;

import edu.poniperro.cotxox.carrera.Carrera;

public class Tarifa {
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final int COSTE_MINIMO = 5;
    static final double PORCENTAJE_COMISION = 0.8;

    public Tarifa() {

    }

    public static double getCosteDistancia(double distancia) {
        return COSTE_MILLA * distancia;
    }

    public static double getCosteTiempo(double minutos) {
        return COSTE_MILLA * minutos;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotalEsperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        if (costeTotalEsperado > COSTE_MINIMO ) {
            return costeTotalEsperado;
        }
        else {
            return COSTE_MINIMO;
        }
    }
}