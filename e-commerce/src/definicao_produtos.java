
public class definicao_produtos {
	public static void main(String[] args) {
		
		String produtos[] = {"leite","biscoito","Veja","revista","cloro","refrigerante","parafuso","l�mpada","papel-toalha","papel higi�nico"};
		String unidadeProdutos[] = {"litro","pacote","unidade","unidade","litro","unidade","pacote","unidade","pacote","pacote"};
		String codigo [] = new String[10];
		
		for(int indice = 0; indice < 10 ; indice++)
		{
			codigo[indice] = "SBB-0" + (indice + 1);
		}
		
		
	}

}
