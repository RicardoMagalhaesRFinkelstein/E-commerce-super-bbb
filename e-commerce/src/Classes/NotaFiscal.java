package Classes;

public class NotaFiscal extends Produto {
	private int numero;
	private int data;
	private double valor;
	private int parcela;
	private double valorImposto;
	
	public NotaFiscal(int codigo,String nome, String medida, double valorUnitario, int estoque,  int numero,
			int data, double valor) {
		super(codigo,nome, medida, valorUnitario, estoque);
		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}
	public NotaFiscal() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void NF (double valortotal, int qntproduto, int unidade, int parcela ) {
		
		this.valorImposto = this.valor * 0.09;
		
			
	System.out.println(" NOTA FISCAL ");
		
	System.out.printf("\nIMPOSTO: = R$ %.2f-----------------------" + this.valorImposto);
	System.out.println("PRODUTO: =  -------------------------" + qntproduto);
	System.out.println("UNIDADE: = -------------------------"+ unidade);
	System.out.println("PARCELAS: = ------------------------"+ parcela);
	System.out.printf("\nVALOR TOTAL:= R$ %.2f---------------------"+ valortotal);
		
	}
	public double valorFinal(double valor)
	{
		return this.valor *= valor;
	}

}
