package cursoLogicaCapitulo04;

public class operadoresRelacionais {
	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2?" + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2?" + tresMenorQueDois);
		
		Boolean tresMenorOuIgualADois = 3 <= 2;
		System.out.println("3 <= 2?" + tresMenorOuIgualADois);
		
		Boolean tresMaiorOuIgualADois = 3 >= 2;
		System.out.println("3 >= 2?" + tresMaiorOuIgualADois);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3?" + tresMaiorOuIgualATres);
		
		Boolean tresDiferenteDeDois = 3 != 2;
		System.out.println("3 != 2?" + tresDiferenteDeDois);
		
//		Boolean tresIgualATres = 3 == 3;
//		System.out.println("3 == 3?" + tresIgualATres);
//		
		Integer cinco = 5;
//		Boolean cincoIgualACinco = cinco == cinco;
//		System.out.println("cinco == cinco?" + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)?" + cincoIgualASeis);
		
		Boolean cincoIgualACinco02 = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)?" + cincoIgualACinco02);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);
		
		
		
				
	}

}
