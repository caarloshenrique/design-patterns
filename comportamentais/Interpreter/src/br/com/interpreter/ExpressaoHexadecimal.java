package br.com.interpreter;

public class ExpressaoHexadecimal implements Expressao {

    private int numero;

    public ExpressaoHexadecimal(int numero) {
        this.numero = numero;
    }

    @Override
    public String interpretar(Contexto contexto) {
        return contexto.getFormatoHexadecimal(numero);
    }
}
