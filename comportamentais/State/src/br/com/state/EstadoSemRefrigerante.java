package br.com.state;

public class EstadoSemRefrigerante extends Estado {

    public EstadoSemRefrigerante(MaquinaRefrigerantes maquinaRefrigerantes) {
        super(maquinaRefrigerantes);
    }

    @Override
    public void inseriuMoeda() {
        System.out.println("FALHOU: Não há mais refrigerantes.");
    }

    @Override
    public void solicitouMoeda() {
        System.out.println("FALHOU: Não há mais refrigerantes, logo não foi possível inserir moeda.");
    }

    @Override
    public void despejarRefrigerante() {
        System.out.println("FALHOU: Não há mais refrigerantes, logo não é possível despejar algum.");
    }

    @Override
    public void inserirRefrigerantes(int quantidadeRefrigerantes) {
        super.inserirRefrigerantes(quantidadeRefrigerantes);

        if (maquinaRefrigerantes.getQuantidadeRefrigerantes() > 0) {
            maquinaRefrigerantes.setEstado(maquinaRefrigerantes.getEstadoSemMoeda());
        }
    }

    @Override
    public void acionarManutencao() {
        System.out.println("OK: máquina agora em manutenção.");
        maquinaRefrigerantes.setEstado(maquinaRefrigerantes.getEstadoManutencao());
    }
}
