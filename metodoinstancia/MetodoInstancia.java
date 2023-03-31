package metodoinstancia;

public class MetodoInstancia {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Vinícius";
		cliente.segundoNome = "Ricarte";
		cliente.telefone = "31988888888";
		cliente.email = "viniciusramt@vr.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Ana Raquel";
		cliente2.segundoNome = "Ricarte";
		cliente2.telefone = "31988888888";
		cliente2.email = "anaraqueldpr@vr.com";
		
		System.out.println("Nome completo: " + cliente.obterNomeCompleto() + " DDD: " + cliente.obterDDD());
		System.out.println("Nome completo: " + cliente2.obterNomeCompleto() + " DDD: " + cliente.obterDDD());
		
//		 System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); // Esse é o método estático.
	}

}
