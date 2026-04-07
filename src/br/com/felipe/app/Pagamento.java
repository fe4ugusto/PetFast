package br.com.felipe.app;

public abstract class Pagamento {
    protected double valor;
    protected String status;

    public Pagamento(double valor) {
    	if (valor <= 0) {
            throw new IllegalArgumentException("Valor do pagamento deve ser positivo.");
        }
        this.valor = valor;
        this.status = "Pendente";
    }

    public abstract void processarPagamento();

    public void exibirDados() {
        System.out.println("=== PAGAMENTO ===");
        System.out.println("Valor: R$" + valor);
        System.out.println("Status: " + status);
    }
}