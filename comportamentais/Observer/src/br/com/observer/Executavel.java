package br.com.observer;

public class Executavel {
    public static void main(String[] args) {
        AssinanteMensagemUm m1 = new AssinanteMensagemUm();
        AssinanteMensagemDois m2 = new AssinanteMensagemDois();
        AssinanteMensagemTres m3 = new AssinanteMensagemTres();
         
        EditorDeMensagem p = new EditorDeMensagem();
         
        p.anexar(m1);
        p.anexar(m2);
         
        p.notificarAtualizacao(new Mensagem("First Message"));
         
        p.desanexar(m1);
        p.anexar(m3);
         
        p.notificarAtualizacao(new Mensagem("Second Message"));
    }
}
