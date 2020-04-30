package br.com.state;

public class EstadoManutencao extends Estado {

    public EstadoManutencao(MaquinaRefrigerantes maquinaRefrigerantes) {
        super(maquinaRefrigerantes);
    }

    public void acionarManutencao() {
        System.out.println("FALHOU: Já está em manutenção.");
    }

    public void desacionarManutencao() {
        System.out.println("OK: Máquina ativa novamente.");

        if (maquinaRefrigerantes.getQuantidadeRefrigerantes() > 0) {
            maquinaRefrigerantes.setEstado(maquinaRefrigerantes.getEstadoSemMoeda());
        } else {
            maquinaRefrigerantes.setEstado(maquinaRefrigerantes.getEstadoSemRefrigerante());
        }
    }
}
