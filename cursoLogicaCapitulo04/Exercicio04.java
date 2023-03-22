package cursoLogicaCapitulo04;

import java.util.Scanner;
	

public class Exercicio04 {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_PARA_APOSENTAR = 25;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Tempo de contribuição: ");
		Integer tempoDeContribuicao = scanner.nextInt();
		
		Boolean idadeMaiorOuIgual = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean tempoMaiorOuIgual = tempoDeContribuicao >= TEMPO_MINIMO_PARA_APOSENTAR;
		
		Boolean podeAposentar =  idadeMaiorOuIgual && tempoMaiorOuIgual;
				
		if (podeAposentar) {
			System.out.println("Pode aposentar.");
	
		} else {
			System.out.println("Não pode aposentar.");
		}
		
		
		scanner.close();
	}

}
