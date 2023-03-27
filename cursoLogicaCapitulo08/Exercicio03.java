package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		Double primeiroNumero = receberNumeros("O primeiro número é: ", scanner);
		
		Integer operacao = escolherOperacao(scanner);
		
		Double segundoNumero = receberNumeros("O segundo número é: ", scanner);
		
		Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);
		
		System.out.println("Resultado final: " + resultado);
		
		scanner.close();

		}

	static Integer escolherOperacao(Scanner scanner) {
		System.out.println("Escolha a operação: ");
	
		String [] operacoes = new String[] { "Soma", "subtração", "divisão", "multiplicação" };
		
		for (int i = 0; i < operacoes.length; i++) {
			System.out.println("["+ i + "]" + operacoes[i]);
		}
			
			return scanner.nextInt();
			}
	
	
	static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch(operacao) {
		
		case 0 : resultado = soma(primeiroNumero, segundoNumero);
			break;
		case 1 : resultado = subtracao(primeiroNumero, segundoNumero);
			break;
		case 2 : resultado = divisao(primeiroNumero, segundoNumero);
			break;
		case 3 : resultado = multiplicacao(primeiroNumero, segundoNumero);
			break;
		default: System.err.println("Operação inválida!");
				System.exit(0);
		}
		return resultado;
	}		

	static Double subtracao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	static Double soma(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	static Double divisao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}
	static Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	static Double receberNumeros(String texto, Scanner scanner) {
		System.out.print(texto);
		Double numeros = scanner.nextDouble();
		return numeros;
	}
		
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
		}
	
}
