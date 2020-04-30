package br.com.strategy;

public class ICMS implements Imposto {

    @Override
    public double calcular(Double valor) {
        return valor * 0.10;
    }

}
