package bibliotecaconsole;

import console.Interacao;

public class BibliotecaConsole {
	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um n�mero: ");
		interacao.imprimir("N�mero: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um n�mero decimal: ");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa � uma mensagem de erro!");
		
		interacao.fechar();
	}
		
		
		
	}

