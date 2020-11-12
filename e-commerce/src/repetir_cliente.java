import java.util.Scanner;


public class repetir_cliente {

	public static void main(String[] args) {
	java.util.Scanner leia = new Scanner(System.in);
	char proximoCliente;
	
	//System.out.println("Próximo cliente S ou N");
	//proximoCliente = leia.next().toUpperCase().charAt(0);
	
	do
	{
		
		
		System.out.println("Próximo cliente S ou N");
		proximoCliente = leia.next().toUpperCase().charAt(0);
		//Repetir todo o processo de compra, desde a seleção até o pagamento
	}
	while (proximoCliente == 'S'); 
	
		System.out.println("Obrigado pelas compras, programa encerrado");
	

	}

}
