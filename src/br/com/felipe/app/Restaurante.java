package br.com.felipe.app;

public class Restaurante {
    private String nome;
    private String tipoCozinha;
    private Cardapio cardapio;

    public Restaurante(String nome, String tipoCozinha) {
        this.nome = nome;
        this.tipoCozinha = tipoCozinha;
        this.cardapio = new Cardapio();
        
    }

    public String getNome() {
        return nome;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public void exibirDados() {
        System.out.println("Restaurante: " + nome);
        System.out.println("Tipo de cozinha: " + tipoCozinha);
    }
    
    public void verCardapio() {
    	
    	System.out.println("\nCardapio do Restaurante  " + nome);
    	cardapio.MostrarCardapio();
    	
    }
}