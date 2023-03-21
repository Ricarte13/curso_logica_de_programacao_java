package cursoLogicaCapitulo03;

import java.util.Scanner;

public class introducaoVariaveis {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double valorProduto = scanner.nextDouble();
		
		System.out.print(" Valor Produto: " + valorProduto);
		
		Double valorProdutoComFrete = valorProduto + 2;
		
		System.out.println("Valor do Produto com Frete: " + valorProdutoComFrete);
				
			scanner.close();
		
	}
}
