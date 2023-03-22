package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Digite o valor da conta de luz: ");
		Double valorDaContaDeLuz = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de água: ");
		Double valorDaContaDeAgua = scanner.nextDouble();
		
		System.out.print("Digite o valor do Gás: ");
		Double valorDoGas = scanner.nextDouble();
		
		System.out.print("Digite o valor da internet: ");
		Double valorDaInternet = scanner.nextDouble();
		
		System.out.print("Digite o valor da Fatura do Cartão: ");
		Double valorDaFaturaDoCartao = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de telefone: ");
		Double valorDaContaDeTelefone = scanner.nextDouble();
		
		System.out.print("Digite o valor da faculdade: ");
		Double valorDaFaculdade = scanner.nextDouble();
		
		System.out.print("Digite o valor da mensalidade do futebol: ");
		Double valorDaMensalidadeFutebol = scanner.nextDouble();
		
		Double valorTotal = valorDaContaDeLuz += valorDaContaDeAgua += valorDoGas += valorDaInternet += valorDaFaturaDoCartao += valorDaContaDeTelefone += valorDaFaculdade += valorDaMensalidadeFutebol;
		
	
		
		System.out.print("Valor Total: " + valorTotal);
		
		
			
		scanner.close();
	}

}
