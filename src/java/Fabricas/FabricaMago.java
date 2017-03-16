package Fabricas;

import armasAtaque.*;
import armasDefensa.*;
import cuerpos.*;

public class FabricaMago implements FabricaPersonajes {

    @Override
    public Cuerpo darCuerpo() {
        return new CuerpoMago();
    }

    @Override
    public ArmaAtaque darArmaAtaque() {
        return new Basculo();
    }

    @Override
    public ArmaDefensa darArmaDefensa() {
        return new CampoDeFuerza();
    }

}
