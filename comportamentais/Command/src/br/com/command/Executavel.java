package br.com.command;

public class Executavel {

    public static void main(String[] args) {
        Loja lojasAfricanas = new Loja("Americanas");
        lojasAfricanas.executarCompra(999.00, new PagamentoCartaoCredito());
        lojasAfricanas.executarCompra(49.00, new PagamentoBoleto());
        lojasAfricanas.executarCompra(99.00, new PagamentoCartaoDebito());

        Loja exorbitante = new Loja("Magazine Luiza");
        exorbitante.executarCompra(19.00, new PagamentoCartaoCredito());

    }
}
