package br.com.observer;

public class AssinanteMensagemDois implements Observador {

    @Override
    public void atualizar(Mensagem mensagem) {
        System.out.println("Assinante mensagem 2 :: " + mensagem.getConteudo());
    }
    
}
