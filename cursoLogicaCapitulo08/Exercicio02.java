package cursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		interarEExibirPosicoes(cursos);

		imprimirNaMesmaLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		interarEExibirPosicoes(formasPagamento);
				

		imprimirNaMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();

	}

	static void imprimir (String texto) {
		System.out.println(texto);
	}
	
	static void imprimirNaMesmaLinha (String texto) {
			System.out.print(texto);

	}
	static void interarEExibirPosicoes (String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
			}
		
	}
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	
	}
		
	static void posicaoInvalida () {
		System.err.println("Posição inválida!");
		System.exit(1);
	}

}
