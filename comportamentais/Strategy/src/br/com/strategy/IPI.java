package br.com.strategy;

public class IPI implements Imposto {

    @Override
    public double calcular(Double valor) {
        return valor * 0.20;
    }

}
