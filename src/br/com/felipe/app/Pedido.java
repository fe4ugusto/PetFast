package br.com.felipe.app;


public class Pedido {
    private String[] itens;
    private double[] valores;
    private double valorTotal;

    public Pedido(String[] itens, double[] valores) {
        this.itens = itens;
        this.valores = valores;
        calcularValorTotal();
    }

    private void calcularValorTotal() {
        valorTotal = 0;
        for (double v : valores) {
            valorTotal += v;
        }
    }

    public void exibirResumo() {
        System.out.println("=== PEDIDO ===");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("- " + itens[i] + " R$" + valores[i]);
        }
        System.out.println("Total: R$" + valorTotal);
    }

	public String[] getItens() {
		return itens;
	}

	public void setItens(String[] itens) {
		this.itens = itens;
	}

	public double[] getValores() {
		return valores;
	}

	public void setValores(double[] valores) {
		this.valores = valores;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
    
    
}