package encapsulamento;

public class Encapsulamento {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		cliente.nome = "Vinicius Ricarte";
//		cliente.telefone = "31988888888";
//		
//		System.out.println("Nome completo: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Vinícius Ricarte");
		cliente.setTelefone("31988888888");
		
		System.out.println("Nome completo: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());
	}

}
