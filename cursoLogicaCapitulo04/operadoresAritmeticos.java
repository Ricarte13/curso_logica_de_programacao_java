package cursoLogicaCapitulo04;

public class operadoresAritmeticos {
	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adi��o: " + adicao);
		
		Integer subtracao = 4 - 2;
		System.out.println("Subtra��o: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplica��o: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divis�o: " + divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("M�dulo: " + modulo);
		
		Integer procedencia01 = 1 + 1 * 5;
		System.out.println("Proced�ncia 01: " + procedencia01);
		
		Integer procedencia02 = (1 + 1) * 5;
		System.out.println("Proced�ncia 02: " + procedencia02);
		
		Integer procedencia03 = 5 * (1 + 1);
		System.out.println("Proced�ncia 03: " + procedencia03);
		
		Integer procedencia04 = 5 * (1 + 1) + 2;
		System.out.println("Proced�ncia 04: " + procedencia04);
		
		Integer procedencia05 = 5 * ((1 + 1) + 2);
		System.out.println("Proced�ncia 05: " + procedencia05);
		
		Integer um = 1;
		
		Integer cinco = 5;
				
		Integer procedenciaComVariaveis = um + cinco ;
		System.out.println("Proced�ncia 06: " + procedenciaComVariaveis);
		
		
	}

}
