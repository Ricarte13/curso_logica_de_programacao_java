package exercicio02;


public class Exercicio02 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Iphone 12 128GB Preto";
		produto.quantidadeEmEstoque = 9;
		
		Produto produto2 = new Produto();
		produto2.nome = "Xiaomi Poco 3";
		produto2.quantidadeEmEstoque = 20;
		
		System.out.println("É necessário repor o estoque do produto " + produto.nome + "? " + produto.necessidadeDeReporEstoque());
		System.out.println("É necessário repor o estoque do produto " + produto2.nome + "? " + produto2.necessidadeDeReporEstoque());
	}
}
