package br.com.observer;

public class AssinanteMensagemUm implements Observador {
    
    @Override
    public void atualizar(Mensagem mensagem) {
        System.out.println("Assinante mensagem 1 :: " + mensagem.getConteudo());
    }
}
