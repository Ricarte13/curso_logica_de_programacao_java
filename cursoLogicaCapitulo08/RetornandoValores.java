package cursoLogicaCapitulo08;

import java.util.Scanner;

public class RetornandoValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		interarEExibirPosicoes(cursos);

		
		Integer posicaoCursoEscolhido = receberNumeroDoUsuario("O curso que você deseja é o: ", scanner);
		
		Boolean posicaoValida = posicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		interarEExibirPosicoes(formasPagamento);
				
		Integer posicaoFormaPagamentoEscolhida = receberNumeroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);
		
		posicaoValida = posicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento); 
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();

	}
	
	static Integer receberNumeroDoUsuario(String texto, Scanner scanner) {
		imprimirNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static Boolean posicaoEscolhidaPeloUsuario( Integer posicao, String[] vetor) {
		Boolean valida =  posicao >= 0 && posicao < vetor.length;
		return valida;
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
