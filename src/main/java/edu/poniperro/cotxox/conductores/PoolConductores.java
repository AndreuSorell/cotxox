package edu.poniperro.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PoolConductores {
    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores; 
    }
    
    public Optional<Conductor> asignarConductor() {
        Optional<Conductor> conductorLibre = seleccionarConductorLibre();
        if (conductorLibre.isPresent()) {
            return conductorLibre;
        }
        else {
            System.out.println("No hay conductores libres");
            return conductorLibre;
            
        }
        
    }
    /**
     * El conductor que devuelve es de tipo Optional, perque findAny() podria devolver null i crearar un  NullPointerException (chica the ring saliendo del pozo)
     * @return Optional<Conductor>
     */
    private Optional<Conductor> seleccionarConductorLibre() {
        return poolConductores.stream()
                                            .filter(c -> !c.isOcupado())
                                            .findAny();
    }
}
