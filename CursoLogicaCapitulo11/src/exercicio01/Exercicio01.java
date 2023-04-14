package exercicio01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio01 {
	
	public static void main(String[] args) throws IOException, EmailException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		
		int i = 0;
		while (true) {
			System.out.print("Digite a tarefa " + i + " :");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break;
				
			}
			
			linhas.add(tarefa);;
			i++;
			
		}
		
		String tarefas ="";
		
		for (int interacao = 0; interacao < linhas.size(); interacao++) {
			tarefas += linhas.get(interacao) + "\n";
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;

		System.out.print("Digite seu e-mail: ");
		String para = scanner.next(); 
				
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
	
		scanner.close();
		
		System.out.println("Fim..");
	}
	
	
	
}
