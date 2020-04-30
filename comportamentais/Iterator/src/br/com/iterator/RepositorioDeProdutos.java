package br.com.iterator;

public class RepositorioDeProdutos implements Container {

    public String produtos[] = {"Coca-Cola", "Pepsi", "Sprite", "Guarana", "Sukita", "Kuat", "Fruki"};

    @Override
    public Iterador getIterador() {
        return new IteradorProdutos(produtos);
    }

}
