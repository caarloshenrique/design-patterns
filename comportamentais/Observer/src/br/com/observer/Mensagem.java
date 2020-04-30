package br.com.observer;

public class Mensagem
{
    final String conteudo;
     
    public Mensagem (String mensagem) {
        this.conteudo = mensagem;
    }
 
    public String getConteudo() {
        return conteudo;
    }
}
