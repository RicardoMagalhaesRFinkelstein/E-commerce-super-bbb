import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.NotaFiscal;
import Classes.Produto;

public class E_commerce_final {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		NotaFiscal nota = new NotaFiscal();
		int escolhaProduto,quantidade;
		char continuar;
		double parcela = 0;
		double valorTotal = 0;
		char proximoCliente = 'S';
		Produto alterarProduto = new Produto();
		
		List <String> carrinho = new ArrayList<>();
		List <Produto> produto = new ArrayList<>();
		
		produto.add(new Produto(1," Leite          ","litro  ",3.59,30));
		produto.add(new Produto(2," Biscoito       ","pacote ",1.81,40));
		produto.add(new Produto(3," Veja           ","unidade",4.15,20));
		produto.add(new Produto(4," Revista        ","unidade",5.99,20));
		produto.add(new Produto(5," Cloro          ","litro  ",3.56,30));
		produto.add(new Produto(6," Refrigerante   ","unidade",6.51,60));
		produto.add(new Produto(7," Parafuso       ","pacote ",3.04,40));
		produto.add(new Produto(8," Lâmpada        ","unidade",5.08,50));
		produto.add(new Produto(9," Papel-toalha   ","pacote ",7.85,60));
		produto.add(new Produto(10,"Papel higiênico","pacote ",8.25,80));
		
		//REFERENCIA PRODUTO
		do
		{
		do
		{
			for (Produto prod: produto)
			{
				System.out.println(prod.getCodigo()+" "+prod.getNome()+"  "+prod.getMedida()+"   "
							+prod.getValorUnitario()+"\t"+prod.getEstoque());
			}
			
	
			System.out.println("O quê deseja comprar? Entre com o codigo do produto:");
			escolhaProduto=leia.nextInt()-1;
			
			System.out.println(produto.get(escolhaProduto).getNome()+" "
						+produto.get(escolhaProduto).getMedida()+" "+produto.get(escolhaProduto).getValorUnitario()+
							" "+produto.get(escolhaProduto).getEstoque());
						
			System.out.println("Entre com a quantidade do produto. ");
			quantidade=leia.nextInt();
			
			carrinho.add(new String(produto.get(escolhaProduto).getNome()+" "+produto.get(escolhaProduto)
					.getMedida()+" "+produto.get(escolhaProduto).getValorUnitario()+" "+quantidade));
			
			valorTotal=valorTotal+(quantidade*produto.get(escolhaProduto).getValorUnitario());
			int tamanho=carrinho.size();
			System.out.println("CARRINHO:");
			for (int x=0;x<tamanho;x++)
			{
			System.out.println(carrinho.get(x));
			}
			produto.get(escolhaProduto).diminuirEstoque(quantidade);
			
			System.out.println("\nDeseja adicionar outro produto? [S/N] ");
			continuar = leia.next().toUpperCase().charAt(0);
			
			
		}while (continuar =='S');
		
		System.out.printf("\nTotal: R$ %.2f",valorTotal ); //TEM QUE ADICIONAR O VALOR DO CARRINHO AQUI
		System.out.print("\nDIGITE A FORMA DE PAGAMENTO\n");
		System.out.print("\nDIGITE [1] PARA COMPRAR Á VISTA , NO DINHEIRO OU CHEQUE COM 20% DE DESCONTO");
		System.out.print("\nDIGITE [2] PARA COMPRAR Á VISTA , NO CARTÃO DE CREDITO COM 15% DE DESCONTO");
		System.out.print("\nDIGITE [3] PARA PARCELAR EM 2X SEM JUROS");
		System.out.print("\nDIGITE [4] PARA PARCELAR EM 3X COM ACRESCIMO DE 10 % DE JUROS\n ");	
		int resposta=leia.nextInt();
		if (resposta ==1)
		{
			double valor = 0.80;
			valorTotal = (valor*valorTotal)*1.09;
			 parcela = 1;
		}
		else if (resposta ==2)
		{
			double valor = 0.85;
			valorTotal = (valor*valorTotal)*1.09;
			parcela = 1;
		}
		else if (resposta ==3)
		{
			double valor = 1;
			valorTotal = (valor*valorTotal)*1.09;			
			parcela = 2;
		}
		else if (resposta ==4)
		{
			double valor = 1.10;
			valorTotal = (valor*valorTotal)*1.09;
			 parcela = 3;		
		}
		int tamanho=carrinho.size();
		System.out.println("NOTA FISCAL :");
		for (int x=0;x<tamanho;x++)
		{
		System.out.println(carrinho.get(x));
		}
		System.out.printf("\n VALOR FINAL R$%.2f com %.0f parcela(s) de R$%.2f",valorTotal,parcela,(valorTotal/parcela));
		System.out.println("Próximo cliente? ");
		proximoCliente = leia.next().toUpperCase().charAt(0);
	}
		while(proximoCliente == 'S');
		
		
	}
}
