package br.com.command;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Boleto criado!\n" + compra.getInfoNota());
    }
}
