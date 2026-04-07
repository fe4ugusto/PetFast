package br.com.felipe.app;

public class Entregador extends Pessoa {
	
    private String veiculo;

    public Entregador(String nome, String telefone, String veiculo) {
        super(nome, telefone);
        this.veiculo = veiculo;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void exibirDados() {
        System.out.println("Nome do entregador: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Veículo: " + veiculo);
    }
}