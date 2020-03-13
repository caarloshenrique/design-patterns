package fabricas;

import classes.AMD;
import classes.DDR3;
import classes.Memoria;
import classes.Processador;

public class FabricaComputadorMedio extends FabricaDeComputador {

    @Override
    public Memoria inserirMemoria() {
        return new DDR3();
    }

    @Override
    public Processador inserirProcessador() {
        return new AMD();
    }
    
}
