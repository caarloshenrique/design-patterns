package br.com.iterator;

public class Executavel {
    public static void main(String[] args) {
        RepositorioDeProdutos rp = new RepositorioDeProdutos();
        
        for (Iterador iterador = rp.getIterador(); iterador.temProximo();) {
            String name = (String) iterador.proximo();
            System.out.println("Produto: " + name);
        }
    }
}
