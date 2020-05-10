package br.com.interpreter;

public class ExpressaoBinaria implements Expressao {

    private int numero;

    public ExpressaoBinaria(int numero) {
        this.numero = numero;
    }

    @Override
    public String interpretar(Contexto contexto) {
        return contexto.getFormatoBinario(this.numero);
    }
}
