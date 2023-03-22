package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite o sinal aritmético [ 1 = adição / 2 = subtração / 3 = multiplicação / 4 = divisão ]: ");
		Integer sinalAritmetico = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (sinalAritmetico.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if (sinalAritmetico.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		
		if (sinalAritmetico.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}

		if (sinalAritmetico.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
		
		
		//Boolean adicao = sinalAritmetico.equals(1);
		
		//Boolean subtracao = sinalAritmetico.equals(2);
		
		//Boolean multiplicacao = sinalAritmetico.equals(3);
		
		//Boolean divisao = sinalAritmetico.equals(4);
		
		
		

	}

}
