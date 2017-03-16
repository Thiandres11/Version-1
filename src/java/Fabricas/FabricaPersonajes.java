package Fabricas;

import armasAtaque.ArmaAtaque;
import armasDefensa.ArmaDefensa;
import cuerpos.Cuerpo;

public interface FabricaPersonajes {
    
    public Cuerpo darCuerpo();
    
    public ArmaAtaque darArmaAtaque();
    
    public ArmaDefensa darArmaDefensa();
}
