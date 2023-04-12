package exercicio02;

public class Produto {
	
	static final  Integer QUANTIDADE_MINIMA_EM_ESTOQUE = 10;

	String nome;
	
	Integer quantidadeEmEstoque;
	
	Boolean necessidadeDeReporEstoque() {
		if(quantidadeEmEstoque < QUANTIDADE_MINIMA_EM_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}