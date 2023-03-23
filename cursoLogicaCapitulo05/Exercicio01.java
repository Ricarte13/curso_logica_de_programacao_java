package cursoLogicaCapitulo05;

import java.util.Scanner;

				
	
public class Exercicio01 {
	
	static final  Double NOTA_MININA_DE_MATEMATICA_PARA_APROVACAO = 60.0;

	static final  Double NOTA_MININA_DE_PORTUGUES_PARA_APROVACAO = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de matem�tica: ");
		Double notaDeMatematica = scanner.nextDouble();
		
		System.out.print("Digite a nota de portugu�s: ");
		Double notaDePortugues = scanner.nextDouble();
		
		Boolean notaMatematicaMaiorOuIgual =  notaDeMatematica >= NOTA_MININA_DE_MATEMATICA_PARA_APROVACAO;
		Boolean notaPortuguesMaiorOuIgual = notaDePortugues >= NOTA_MININA_DE_PORTUGUES_PARA_APROVACAO;
		
		Boolean notaTotal = notaDeMatematica + notaDePortugues >= 150;
		
		Boolean notaDeAprovacao = notaTotal && notaMatematicaMaiorOuIgual && notaPortuguesMaiorOuIgual;
		
		if (notaDeAprovacao) {
			System.out.println("Parab�ns!Voc� foi aprovado.");
		} else {
			System.out.println("Voc� foi reprovado. N�o desista, tente novamente!");
		}
		
		scanner.close();
	
}
}
