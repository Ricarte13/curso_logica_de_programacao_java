package cursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("Digite a meta de faturamento para esse ano: ");
		Double meta = scanner.nextDouble();
		
		System.out.print("Digite o faturamento real da empresa: ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.print("Digite a m�dia do sal�rio anual: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean bonusTotal = faturamentoReal >= meta;
		Boolean bonusParcial = (faturamentoReal < meta) && (faturamentoReal >= oitentaPorCentoDaMeta);
		
		Double valorDoBonusTotal = mediaSalarial;
		
		
		if (bonusTotal) {
			System.out.println("O valor do b�nus ser�: " + valorDoBonusTotal);
		} else if (bonusParcial) { 
				Double valorDoBonusParcial = (mediaSalarial * 80) / 100;
				
				System.out.println("O valor do b�nus ser�: " + valorDoBonusParcial);
		}else {
			System.out.println("Meta n�o atingida. Vamos nos esfor�ar mais.");
		}
		
		
		
		scanner.close();
	}
	  
}
