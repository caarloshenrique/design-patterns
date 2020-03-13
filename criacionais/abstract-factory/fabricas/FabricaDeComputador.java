package fabricas;

import classes.Memoria;
import classes.Processador;
public abstract class FabricaDeComputador {
    public abstract Memoria inserirMemoria();
    public abstract Processador inserirProcessador();
}
