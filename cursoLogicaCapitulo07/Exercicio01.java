package cursoLogicaCapitulo07;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefasDiarias = new String[5];
		
		for (int i = 0; i < tarefasDiarias.length; i++ ) {
			System.out.print("Tarefas di�rias "  + i + ":" );
			tarefasDiarias[i] = scanner.nextLine();
			
		}
		
		
		System.out.println("As principais tarefas di�rias s�o: ");
		for (int i = 0; i < tarefasDiarias.length; i++ ) {
			System.out.println(i + ": " + tarefasDiarias[i]);
			
			
		}
		
		scanner.close();
	}

}
