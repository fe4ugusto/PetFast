package br.com.felipe.main;

import br.com.felipe.app.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // 1. Exibir restaurante e cardápio
            Restaurante restaurante = new Restaurante("STUFA DI MONTEVERDE", "Italiana");
            System.out.println("\n🍽️ Restaurante disponível:");
            restaurante.exibirDados();
            restaurante.verCardapio();

            // 2. Cliente escolhe itens do cardápio
            System.out.println("\n🛒 Adicionando itens ao carrinho...");
            String[] itensSelecionados = { "Pizza Margherita", "Suco de Uva", "Tiramisu" };
            double[] precosSelecionados = { 35.0, 10.0, 20.0 };

            // 3. Criar pedido
            Pedido pedido = new Pedido(itensSelecionados, precosSelecionados);
            System.out.println("\n📦 Resumo do pedido:");
            pedido.exibirResumo();

            // 4. Processar pagamento antes da entrega
            Pagamento pagamento = new PagamentoPix(pedido.getValorTotal(), "ONTEVERDE@GMAIL.COM");
            System.out.println("\n💳 Processando pagamento...");
            pagamento.processarPagamento();
            pagamento.exibirDados();

            // 5. Atribuir entregador e criar entrega
            Entregador entregador = new Entregador("Gustavo", "20097-19075", "Moto");
            
            Entrega entrega = new Entrega("Rua Azul, 12300", entregador);
            entrega.setTempoEstimado(45); 
            System.out.println("\n🚚 Entrega em andamento:");
            entrega.exibirDados();

            // 6. Cliente avalia a entrega
            entrega.avaliar(5); // 
            System.out.println("⭐ Avaliação registrada: " + entrega.getNota() + " estrelas");

            System.out.println("\n✅ Pedido finalizado com sucesso! Obrigado por usar nosso app.");

        } catch (IllegalArgumentException e) {
            System.out.println("❌ Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }
    }

}
