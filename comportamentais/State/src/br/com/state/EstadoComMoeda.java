package br.com.state;

public class EstadoComMoeda extends Estado {

    public EstadoComMoeda(MaquinaRefrigerantes maquinaRefrigerantes) {
        super(maquinaRefrigerantes);
    }

    @Override
    public void inseriuMoeda() {
        System.out.println("FALHOU: Você já inseriu uma moeda.");
    }

    @Override
    public void solicitouMoeda() {
        System.out.println("OK: A moeda será devolvida em um segundo.");
        maquinaRefrigerantes.setEstado(maquinaRefrigerantes.getEstadoSemMoeda());
    }

    @Override
    public void despejarRefrigerante() {
        System.out.println("OK: O refrigerante será despejado em um segundo.");
        maquinaRefrigerantes.setEstado(maquinaRefrigerantes.getEstadoVenda());
        maquinaRefrigerantes.getEstadoVenda().despejar();
    }
}
