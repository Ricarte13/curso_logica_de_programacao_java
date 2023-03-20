import java.util.Scanner;

public class CalculoIMC2 {
	
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o valor do peso: ");
	Double valorPeso = scanner.nextDouble();
	
	System.out.println("Digite altura: ");
	Double altura = scanner.nextDouble();
	
	Double multiplicaçãoAltura = altura * altura;
	
	Double resultado = valorPeso / multiplicaçãoAltura;
	
	System.out.println("IMC= " + resultado);
	
	scanner.close();
	
	}

}
