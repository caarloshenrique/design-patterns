package br.com.observer;

public class AssinanteMensagemTres implements Observador {

    @Override
    public void atualizar(Mensagem mensagem) {
        System.out.println("Assinante mensagem 3 :: " + mensagem.getConteudo());
    }
    
}
