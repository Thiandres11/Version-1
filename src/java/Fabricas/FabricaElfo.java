package Fabricas;

import armasAtaque.*;
import armasDefensa.*;
import cuerpos.*;

public class FabricaElfo implements FabricaPersonajes {

    @Override
    public Cuerpo darCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public ArmaAtaque darArmaAtaque() {
        return new Arco();
    }

    @Override
    public ArmaDefensa darArmaDefensa() {
        return new Escudo();
    }
    
}
