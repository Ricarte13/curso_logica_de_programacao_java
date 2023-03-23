package cursoLogicaCapitulo05;

import java.util.Scanner;

public class UsandoIfEncadeado {
	
	static final Double PESO_MINIMO = 60.0;
	
	static final Double PESO_MAXIMO = 90.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso > 0) && (peso <= PESO_MINIMO);
		Boolean pesoMedio = (peso > PESO_MINIMO) && (peso <= PESO_MAXIMO);
		Boolean pesoPesado = peso > PESO_MAXIMO;
		
		if (pesoLeve) {
			System.out.println(" O lutador (a) é peso leve!");
		} else if (pesoMedio) {
			System.out.println(" O lutador (a) é peso médio!");
		} else if (pesoPesado) {
			System.out.println(" O lutador (a) é peso pesado!");
		} else {
			System.out.println("Não se encaixa em nenhuma categoria.");
		}
		
		scanner.close();
	}

}
