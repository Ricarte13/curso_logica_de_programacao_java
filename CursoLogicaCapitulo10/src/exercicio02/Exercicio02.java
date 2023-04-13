package exercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\\\Users\\\\vinic\\\\eclipse-workspace\\\\Aula10\\\\Exercicio-01.txt");
		List<String> linhas = Files.readAllLines(arquivo);
		
		for (int i = 0; i < linhas.size(); i++) {
			String tarefa = linhas.get(i);
			
			System.out.println("Tarefa " + i + ":" + tarefa);
		}
		
	}

}
