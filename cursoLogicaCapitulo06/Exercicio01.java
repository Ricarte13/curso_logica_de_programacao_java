package cursoLogicaCapitulo06;

public class Exercicio01 {
	
	static final Integer DIVISOR = 3;

	public static void main(String[] args) {
		
		Integer [] numerosDivisiveisPorTres = new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		for (int i=0 ;i < numerosDivisiveisPorTres.length; i++) {
			
			Integer numero = numerosDivisiveisPorTres[i];
			Integer moduloPorTres = numero % DIVISOR;
			
			if (moduloPorTres.equals(0)) { 
				
				System.out.println("O n�mero " + numero + " � divis�vel por 3!");
				
				
			}
			
			
		}
		
				System.out.println("Fim!");
	}

}