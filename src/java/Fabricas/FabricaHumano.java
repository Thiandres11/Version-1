package Fabricas;

import armasAtaque.ArmaAtaque;
import armasAtaque.Espada;
import armasDefensa.ArmaDefensa;
import armasDefensa.Armadura;
import cuerpos.Cuerpo;
import cuerpos.CuerpoHumano;

public class FabricaHumano implements FabricaPersonajes {

    @Override
    public Cuerpo darCuerpo() {
        return new CuerpoHumano();
    }

    @Override
    public ArmaAtaque darArmaAtaque() {
        return new Espada();
    }

    @Override
    public ArmaDefensa darArmaDefensa() {
        return new Armadura();
    }

}
