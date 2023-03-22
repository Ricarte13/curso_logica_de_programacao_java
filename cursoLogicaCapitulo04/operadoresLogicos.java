package cursoLogicaCapitulo04;

public class operadoresLogicos {
	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Não aplique o desconto.");
		}
	}
}
