package br.com.iterator;

public class IteradorProdutos implements Iterador {

    int indice;
    String recebeVetor[];

    public IteradorProdutos(String[] vetor) {
        this.recebeVetor = vetor;
    }

    @Override
    public boolean temProximo() {
        if (indice < recebeVetor.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object proximo() {
        if (this.temProximo()) {
            return recebeVetor[indice++];
        }
        return null;
    }

}
