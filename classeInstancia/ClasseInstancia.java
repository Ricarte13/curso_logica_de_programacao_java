package classeInstancia;

public class ClasseInstancia {
	public static void main(String[] args) {
		
		System.out.println("Quantidade em estoque: " + Produto.quantidadeEmEstoque);
		
		Produto produto = new Produto();
		produto.nome = "Fone";
		
		
		
		Produto produto2 = new Produto();
		produto2.nome = "Celular";
//		produto.quantidadeEmEstoque = 10;
		
		System.out.println("Quantidade em estoque: " + produto.quantidadeEmEstoque);
		
//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto.nome);
	}

}
