package br.com.observer;

import java.util.ArrayList;
import java.util.List;

public class EditorDeMensagem implements Sujeito {
    private List<Observador> observadores = new ArrayList<Observador>();
 
    @Override
    public void anexar(Observador observador) {
        observadores.add(observador);
    }
 
    @Override
    public void desanexar(Observador observador) {
        observadores.remove(observador);
    }
 
    @Override
    public void notificarAtualizacao(Mensagem mensagem) {
        for(Observador observador: observadores) {
            observador.atualizar(mensagem);
        }
    }
}
