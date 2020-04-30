package br.com.state;

public class MaquinaRefrigerantes {

    private Estado estadoSemMoeda;
    private Estado estadoComMoeda;
    private Estado estadoVenda;
    private Estado estadoSemRefrigerante;
    private Estado estadoManutencao;

    private Estado estado;
    private int quantidadeRefrigerantes;

    public MaquinaRefrigerantes(int quantidadeRefrigerantes) {
        this.setQuantidadeRefrigerantes(quantidadeRefrigerantes);

        estadoSemMoeda = new EstadoSemMoeda(this);
        estadoComMoeda = new EstadoComMoeda(this);
        estadoVenda = new EstadoVenda(this);
        estadoSemRefrigerante = new EstadoSemRefrigerante(this);
        estadoManutencao = new EstadoManutencao(this);

        if (quantidadeRefrigerantes > 0) {
            estado = estadoSemMoeda;
        } else {
            estado = estadoSemRefrigerante;
        }
    }

    public void inseriuMoeda() {
        estado.inseriuMoeda();
    }

    public void solicitouMoeda() {
        estado.solicitouMoeda();
    }

    public void despejarRefrigerante() {
        estado.despejarRefrigerante();
    }

    public void inserirRefrigerantes(int quantidadeRefrigerantes) {
        estado.inserirRefrigerantes(quantidadeRefrigerantes);
    }

    public void acionarManutencao() {
        estado.acionarManutencao();
    }

    public void desacionarManutencao() {
        estado.desacionarManutencao();
    }

    public int getQuantidadeRefrigerantes() {
        return quantidadeRefrigerantes;
    }

    public void setQuantidadeRefrigerantes(int quantidadeRefrigerantes) {
        this.quantidadeRefrigerantes = quantidadeRefrigerantes > 0 ? quantidadeRefrigerantes : 0;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstadoSemMoeda() {
        return estadoSemMoeda;
    }

    public Estado getEstadoComMoeda() {
        return estadoComMoeda;
    }

    public Estado getEstadoVenda() {
        return estadoVenda;
    }

    public Estado getEstadoSemRefrigerante() {
        return estadoSemRefrigerante;
    }

    public Estado getEstadoManutencao() {
        return estadoManutencao;
    }
}
