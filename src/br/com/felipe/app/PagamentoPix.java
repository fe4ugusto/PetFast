package br.com.felipe.app;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        if (chavePix == null || chavePix.isEmpty()) {
            throw new IllegalArgumentException("Chave Pix inválida.");
        }
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix para a chave: " + chavePix);
        status = "Confirmado";
    }
}