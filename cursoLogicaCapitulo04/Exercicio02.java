package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio02 {
	
	static final Integer VALOR_DO_FRETE = 15;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorDoProduto = scanner.nextDouble();
		
		
		Boolean valorSemFrete = valorDoProduto >= 100;
		
		Double valorFinal = valorDoProduto + VALOR_DO_FRETE;
		
		
		if (valorSemFrete) {
			valorFinal = valorDoProduto - VALOR_DO_FRETE;
			
		}
		
		System.out.println("Valor Final: " + valorFinal);
		
		scanner.close();
		
		
		
	}
}
