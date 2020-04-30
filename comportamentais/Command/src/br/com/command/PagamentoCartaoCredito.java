package br.com.command;

public class PagamentoCartaoCredito implements Pagamento {

    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Crédito aprovado!\n" + compra.getInfoNota());
    }
}
