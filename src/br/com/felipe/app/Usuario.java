package br.com.felipe.app;

public class Usuario extends Pessoa {
	
	    private String endereco;

	    public Usuario(String nome, String telefone, String endereco) {
	        super(nome, telefone);
	        this.endereco = endereco;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public void exibirDados() {
	        System.out.println("Nome: " + getNome());
	        System.out.println("Telefone: " + getTelefone());
	        System.out.println("Endereço: " + endereco);
	    }
	}


