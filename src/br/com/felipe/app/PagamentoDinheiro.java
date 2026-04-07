package br.com.felipe.app;

public class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em dinheiro recebido no valor de R$" + valor);
        status = "Confirmado";
    }
}