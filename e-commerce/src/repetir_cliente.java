import java.util.Scanner;


public class repetir_cliente {

	public static void main(String[] args) {
	java.util.Scanner leia = new Scanner(System.in);
	char proximoCliente;
	
	//System.out.println("Pr�ximo cliente S ou N");
	//proximoCliente = leia.next().toUpperCase().charAt(0);
	
	do
	{
		
		System.out.println("\n Ma��");
		System.out.println("Pr�ximo cliente S ou N");
		proximoCliente = leia.next().toUpperCase().charAt(0);
		//Repetir todo o processo de compra, desde a sele��o at� o pagamento
	}
	while (proximoCliente == 'S'); 
	
		System.out.println("Obrigado pelas compras, programa encerrado");
	

	}

}
