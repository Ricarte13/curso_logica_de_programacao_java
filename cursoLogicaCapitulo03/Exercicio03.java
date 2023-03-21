package cursoLogicaCapitulo03;

import java.util.Scanner;

	

public class Exercicio03 {
	
	static final Integer NOTA_MINIMA_PARA_APROVACAO = 70;
			
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println(" Variável Verdaeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println(" Variável Falsa: " + variavelFalsa);
		
		System.out.println("--------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nota Final: ");
		
		Integer notaFinal = scanner.nextInt();
		
		Boolean notaAprovado = notaFinal >= NOTA_MINIMA_PARA_APROVACAO;
		
		System.out.println( "Nota final: " + notaFinal );
		if (notaAprovado) { 
			System.out.println( " O aluno foi aprovado.");
		}
		else {
			System.out.println(" O aluno foi reprovado.");
			
		scanner.close();
		}
	}
}
