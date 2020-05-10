package br.com.interpreter;

public class Contexto {

    public String getFormatoBinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String getFormatoHexadecimal(int numero) {
        return Integer.toHexString(numero);
    }
}
