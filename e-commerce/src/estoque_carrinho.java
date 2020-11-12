import java.util.Scanner;

public class estoque_carrinho {

	public static void main(String[] args) {
		java.util.Scanner leia = new Scanner(System.in);

		String produtos[] = { "leite", "biscoito", "Veja", "revista", "cloro", "refrigerante", "parafuso", "l�mpada",
				"papel-toalha", "papel higi�nico" };
		String unidadeProdutos[] = { "litro", "pacote", "unidade", "unidade", "litro", "unidade", "pacote", "unidade",
				"pacote", "pacote" };
		double valor[] = { 3.5, 1.8, 4.0, 5.99, 3.5, 6.5, 3.0, 5.0, 7.0, 14.0 };
		int estoque[] = { 30, 40, 20, 20, 30, 60, 40, 50, 60, 80 };
		int carrinhoQuantidade[] = new int[10];
		String codigo[] = new String[10];
		String produto;
		char pergunta1;
		int quantidade = 0, contador = 0;
		double precoCompra[] = new double[10], valorCarrinho = 0.0, valorAgregado[] = new double[10];

		/*
		 * for(int indice = 0; indice < 10 ; indice++) { codigo[indice] = "SBB-0" +
		 * (indice + 1); }
		 */

		// ===========================================================Aqui � a parte de
		// controle de estoque
		do {
			System.out.println("Bem vindo ao Mercadinho SBB! Veja nossas ofertas do dia!!!");

			for (int x = 0; x < 10; x++) {
				codigo[x] = "SBB-0" + (x + 1);
				System.out.println(codigo[x] + "\t" + produtos[x] + "\t\t R$ " + valor[x] + "\t\t por "
						+ unidadeProdutos[x] + "\t\t em estoque: " + estoque[x]);
			}

			// ===========================================================Aqui � a parte do
			// carrinho de compras
			do {

				System.out.println("O qu� deseja comprar? Entre com o codigo do produto: ");
				produto = leia.next();

				contador = 0;

				for (int x = 0; x < 10; x++) {
					if (produto.equals(codigo[x])) {
						if (estoque[x] != 0) {
							do {
								System.out.println(codigo[x] + "\t" + produtos[x] + "\t\t R$ " + valor[x] + "\t\t por "
										+ unidadeProdutos[x] + "\t\t em estoque: " + estoque[x]);
								System.out.println("Quanto(s) " + unidadeProdutos[x]
										+ "(s) voc� quer comprar? Obs: O minimo de compra � 10 por "
										+ unidadeProdutos[x] + "(s).");
								quantidade = leia.nextInt();

								if (quantidade > estoque[x] || quantidade < 10) {
									System.out.println(
											"ERROR! Quantidade do produto acima do estoque ou abaixo do minimo de compra.");
								}

							} while (quantidade > estoque[x] || quantidade < 10);

							// if(quantidade<=estoque[x] && quantidade>=10)
							// {
							estoque[x] = (estoque[x] - quantidade);
							precoCompra[x] = (quantidade * valor[x]);
							valorAgregado[x] = (valorAgregado[x] + precoCompra[x]);
							valorCarrinho = (valorCarrinho + precoCompra[x]);
							carrinhoQuantidade[x] = (carrinhoQuantidade[x] + quantidade);
							// }
						} else {
							System.out.println("Produto fora de estoque!");
						}

					} else {
						contador++;
					}
				}
				if (contador == 10) {
					System.out.println("ERROR!Condigo informado n�o consta no sistema.");
				}

			} while (contador == 10);

			System.out.println("Seu carrinho de compras: ");
			for (int x = 0; x < 10; x++) {
				if (precoCompra[x] > 0) {
					System.out.println(codigo[x] + "\t" + produtos[x] + "\t\t Quantidade: " + carrinhoQuantidade[x]
							+ "\t\t Valor total : R$" + valorAgregado[x]);
				}
			}

			System.out.println("Valor total do carrinho de compras: R$" + valorCarrinho);

			System.out.println("Deseja comprar mais algum produto?");
			pergunta1 = leia.next().toUpperCase().charAt(0);

		} while (pergunta1 == 'S');

	}

}
