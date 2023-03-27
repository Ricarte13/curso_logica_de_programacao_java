package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer numeroTabuada = multiplicando(scanner);
		
		imprimirTabuada(numeroTabuada, 0);
		
		scanner.close();
		
		
	}	
	
		static void imprimirTabuada (Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + "x" + multiplicador + "=" + (multiplicando * multiplicador) );
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	
	}
	
	static Integer multiplicando(Scanner scanner) {
		System.out.print("Digite um número: ");
		return scanner.nextInt();
		
	}

}
