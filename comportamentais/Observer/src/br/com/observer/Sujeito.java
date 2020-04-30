package br.com.observer;

public interface Sujeito {
    public void anexar(Observador observador);
    public void desanexar(Observador observador);
    public void notificarAtualizacao(Mensagem mensagem);
}
