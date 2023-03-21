package cursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Digite o valor do poduto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade desejada: ");
		Double quantidade = scanner.nextDouble();
		
		Double valorSubtotal = valorProduto * quantidade;
				
		
		Boolean quantidadeMaiorOuIgualDez = quantidade >= 10;
		
		Double percentualDesconto = 10.0;
		
		if ( quantidadeMaiorOuIgualDez) { 
				percentualDesconto = 10.0;
			
			}
		
		Double desconto = valorSubtotal * percentualDesconto/100;
		
		Double valorFinal = valorSubtotal - desconto;
		
		System.out.println( " Valor Total: " + valorFinal);
		
		
		scanner.close();
	}

}
