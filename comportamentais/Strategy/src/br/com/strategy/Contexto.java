package br.com.strategy;

public class Contexto {
    
    private final Imposto imposto;
    
    public Contexto(Imposto imposto) {
        this.imposto = imposto;
    }

    public double calcular(Double valor) {
        return this.imposto.calcular(valor);
    }
}
