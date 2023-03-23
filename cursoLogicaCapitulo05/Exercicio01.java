package cursoLogicaCapitulo05;

import java.util.Scanner;

				
	
public class Exercicio01 {
	
	static final  Double NOTA_MININA_DE_MATEMATICA_PARA_APROVACAO = 60.0;

	static final  Double NOTA_MININA_DE_PORTUGUES_PARA_APROVACAO = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de matemática: ");
		Double notaDeMatematica = scanner.nextDouble();
		
		System.out.print("Digite a nota de português: ");
		Double notaDePortugues = scanner.nextDouble();
		
		Boolean notaMatematicaMaiorOuIgual =  notaDeMatematica >= NOTA_MININA_DE_MATEMATICA_PARA_APROVACAO;
		Boolean notaPortuguesMaiorOuIgual = notaDePortugues >= NOTA_MININA_DE_PORTUGUES_PARA_APROVACAO;
		
		Boolean notaTotal = notaDeMatematica + notaDePortugues >= 150;
		
		Boolean notaDeAprovacao = notaTotal && notaMatematicaMaiorOuIgual && notaPortuguesMaiorOuIgual;
		
		if (notaDeAprovacao) {
			System.out.println("Parabéns!Você foi aprovado.");
		} else {
			System.out.println("Você foi reprovado. Não desista, tente novamente!");
		}
		
		scanner.close();
	
}
}
