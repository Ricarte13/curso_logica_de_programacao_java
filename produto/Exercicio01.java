package produto;


public class Exercicio01 {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "Iphone 12 128GB Preto";
		produto.quantidadeEmEstoque = 9;
		
		System.out.println("É necessário repor o estoque do produto " + produto.nome + "? " + necessidadeDeReporEstoque(produto));
		
	}
			
	static Boolean necessidadeDeReporEstoque(Produto produto) {
		if(produto.quantidadeEmEstoque < produto.QUANTIDADE_MINIMA_EM_ESTOQUE) {
			return true;
		}

		return false;
	}		
}
