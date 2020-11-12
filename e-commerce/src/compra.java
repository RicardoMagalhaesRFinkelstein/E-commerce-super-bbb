import java.util.Scanner;

public class compra {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int quantidade = 1;
		int qnt_total = 0;
		double valorunitario = 0;
		double valorproduto = 0;
		double valor, total = 0;
		double imposto = 0.0;
		int esc = 0;
		boolean status = true;
		char confirmacao;

		while (status == true) {

			System.out.println("Digite a quantidade do item");
			quantidade = leia.nextInt();

			if (quantidade > 0) {

				System.out.println(" Digite o preço Unitario desse ITEM");

				valorunitario = leia.nextDouble();

				valorproduto = quantidade + valorunitario;

				total = total + valorproduto;

				qnt_total = qnt_total + quantidade;
			}

			else {
				status = false;
			}
			System.out.println(" o numero de itens comprado foi :" + qnt_total);
			System.out.println(" Total " + total);
			System.out.print("\nDIGITE A FORMA DE PAGAMENTO\n");
			System.out.print("\nDIGITE [1] PARA COMPRAR Á VISTA , NO DINHEIRO OU CHEQUE");
			System.out.print("\nDIGITE [2] PARA COMPRAR Á VISTA , NO CARTÃO DE CREDITO");
			System.out.print("\nDIGITE [3] PARA PARCELAR EM 2X SEM JUROS");
			System.out.print("\nDIGITE [4] PARA PARCELAR EM 3X COM ACRESCIMO DE 10 % DE JUROS\n ");
			esc = leia.nextInt();
			if (esc == 1) 
			{
				System.out.printf("\n PREÇO FINAL: R$%.2f\n", (total - (total * 20 / 100)));
			} 
			else if (esc == 2)
			{
				System.out.printf("\n PREÇO FINAL: R$%.2f\n", (total - (total * 15 / 100)));
			}
			else if (esc == 3)
			{
				System.out.printf("\n PREÇO FINAL: R$%.2f\n", total);
			} 
			else if (esc == 4) 
			{
				System.out.printf("\n PREÇO FINAL: R$%.2f\n", (total - (total * 10 / 100)));
			}
			System.out.print("Digite se voce deseja a nota fiscal: ");
			confirmacao = leia.next().toUpperCase().charAt(0);

			

			if (confirmacao == 'S') {

				System.out.print("SUA NOTA FISCAL NUMERO 95845235 NO VALOR DE:" + total);

			} else if (confirmacao == 'N') {
				System.out.print("OBRIGADO(A) POR COMPRAR NO SUPER BBB");

				status = true;
				{

				}

			}

		}

	}
}
