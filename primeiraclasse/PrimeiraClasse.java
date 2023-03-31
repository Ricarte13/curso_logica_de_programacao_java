package primeiraclasse;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Smartphone";
		
		produto.quantidade = 15;
		
		produto.preco = 200.0;
		
		exibirQuantidadeEmEstoque(produto);
		
		
	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("A quantidade de  " + produto.nome + " em estoque é de " + produto.quantidade + " unidade(s).");
	}
}

