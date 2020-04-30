package adapter;

public class AdapterTomada extends TomadaDoisPinos {
    private final TomadaTresPinos tomada;
    public AdapterTomada(TomadaTresPinos t) {
        this.tomada = t;
    }
    
    @Override
    public void ligarNaTomadaDeDoisPinos() {
        tomada.ligarNaTomadaDeTresPinos();
    }
    
}
