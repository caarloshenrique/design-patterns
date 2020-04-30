package br.com.command;

public class PagamentoCartaoDebito implements Pagamento {

    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Débito aprovado!\n" + compra.getInfoNota());
    }
}
