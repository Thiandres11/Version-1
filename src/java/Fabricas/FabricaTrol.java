package Fabricas;

import armasAtaque.*;
import armasDefensa.*;
import cuerpos.*;

public class FabricaTrol implements FabricaPersonajes {

    @Override
    public Cuerpo darCuerpo() {
        return new CuerpoTrol();
    }

    @Override
    public ArmaAtaque darArmaAtaque() {
        return new Mazo();
    }

    @Override
    public ArmaDefensa darArmaDefensa() {
        return new TrozoDeMadera();
    }
    
}
