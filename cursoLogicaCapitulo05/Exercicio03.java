package cursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio03 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o dia da semana: ");
			Integer diaDaSemana = scanner.nextInt();
			
			String dia = "nome";
			
			switch (diaDaSemana) {
			
			case 1 : dia = "Domingo";
				break;  
			case 2 : dia = "Segunda-feira";
				break;  
			case 3 : dia = "Ter�a-feira";
				break;  
			case 4 : dia = "Quarta-feira";
				break;  
			case 5 : dia = "Quinta-feira";
				break;  
			case 6 : dia = "Sexta-Feira";
				break;  
			case 7 : dia = "S�bado";
				break; 
			default:
				System.err.println("Digite um dia v�lido: ");
				System.exit(1);
			}
			
			System.out.println("O dia da semana �: " + dia);
			
			scanner.close();
			
		}
}
