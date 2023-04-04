package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.codigo = 02;
		pedido.subtotal = 20.0;
		pedido.desconto = 4.0;
		
		
		System.out.println(" Código do pedido: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + 
							", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());
		

	}

}
