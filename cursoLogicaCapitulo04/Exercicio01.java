package cursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite o sinal aritm�tico [ 1 = adi��o / 2 = subtra��o / 3 = multiplica��o / 4 = divis�o ]: ");
		Integer sinalAritmetico = scanner.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
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
