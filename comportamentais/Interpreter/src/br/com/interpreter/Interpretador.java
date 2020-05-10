package br.com.interpreter;

public class Interpretador {

    public Contexto contexto;

    public Interpretador(Contexto numero) {
        this.contexto = numero;
    }

    public String interpretar(String str) {
        Expressao expressao = null;

        if (str.contains("Hexadecimal")) {
            expressao = new ExpressaoHexadecimal(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binário")) {
            expressao = new ExpressaoBinaria(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }

        return expressao.interpretar(contexto);
    }
}
