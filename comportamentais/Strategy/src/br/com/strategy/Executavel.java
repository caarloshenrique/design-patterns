package br.com.strategy;

public class Executavel {

    public static void main(String[] args) {

        System.out.println("Montante: R$ 100.0");

        Contexto contexto = new Contexto(new ICMS());
        System.out.println("Valor ICMS: R$ " + contexto.calcular(100.0));

        contexto = new Contexto(new IPI());
        System.out.println("Valor IPI: R$ " + contexto.calcular(100.0));
    }
}
