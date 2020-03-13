package fabricas;

import classes.DDR4;
import classes.Intel;
import classes.Memoria;
import classes.Processador;

public class FabricaComputadorBom extends FabricaDeComputador {

    public Memoria inserirMemoria() {
        return new DDR4();
    }
    
    public Processador inserirProcessador() {
        return new Intel();
    }
   
}
