package abstractFactory;

import classes.Computador;
import fabricas.FabricaComputadorBom;
import fabricas.FabricaComputadorMedio;
import fabricas.FabricaDeComputador;

public class Executavel {
    public static void main(String[] args) {
        Computador c1 = montarComputador("bom");
        Computador c2 = montarComputador("medio");
        System.out.println("A memoria eh " + c1.getMemoria() + " o processador eh " + c1.getProcessador());
        System.out.println("A memoria eh " + c2.getMemoria() + " o processador eh " + c2.getProcessador());
    }
    
    public static Computador montarComputador(String tipo){
        FabricaDeComputador cf = null;
        switch(tipo){
            case "bom":
                cf = new FabricaComputadorBom();
                break;
            case "medio":
                cf = new FabricaComputadorMedio();
                break;
        }
        Computador c = new Computador();
        c.setProcessador(cf.inserirProcessador());
        c.setMemoria(cf.inserirMemoria());
        return c;
    }
}
