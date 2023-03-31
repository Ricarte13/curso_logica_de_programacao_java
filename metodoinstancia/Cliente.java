package metodoinstancia;

public class Cliente {

	String primeiroNome;
	
	String segundoNome;
	
	String telefone;
	
	String email;
	
	String obterNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + segundoNome;
		
		return nomeCompleto;
	}
	
	String obterDDD() {
		String ddd = telefone.substring(0, 2);
		
		return ddd;
	}
	
}
