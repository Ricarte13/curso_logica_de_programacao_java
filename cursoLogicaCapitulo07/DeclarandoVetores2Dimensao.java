package cursoLogicaCapitulo07;

public class DeclarandoVetores2Dimensao {

		public static void main(String[] args) {
			
//			Double faturamentoDia = 1000.0;
			
			Double[] faturamentoJaneiro = new Double[] { 1200.0, 1400.0, 1600.0};
			Double[] faturamentoFevereiro = new Double[] { 2300.0, 2500.0, 2700.0};
			
			Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro};
			
//			System.out.println("Faturamento do dia 1° de janeiro: " + faturamentoAnual[0][0]);
//			System.out.println("Faturamento do dia 2  de fevereiro: " + faturamentoAnual[1][1]);
			
			
			for (int i = 0; i < faturamentoAnual.length; i++) {
				System.out.println("Mês: " + (i + 1));
				
				Double[] mes = faturamentoAnual[i];
				
				for (int y = 0; y < mes.length; y++) {
				
					Double dia = mes[y];
				
					System.out.println("Dia: " + (y + 1) + ": " + dia);
					
				}
			}
			
			
		}		
}
