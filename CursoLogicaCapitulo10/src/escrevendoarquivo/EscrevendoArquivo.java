package escrevendoarquivo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscrevendoArquivo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador " + i + ": ");
			String nome = scanner.nextLine();

			linhas.add(nome);
		}

		Path arquivo = Paths.get("C:\\\\\\\\Users\\\\\\\\vinic\\\\\\\\eclipse-workspace\\\\\\\\Aula10.txt");
		Files.write(arquivo, linhas);

		scanner.close();
		System.out.println("Fim...");
		
		
		
		
	}

}
