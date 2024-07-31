package posafterferias;
import java.util.Scanner;
public class eita {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		try {
		double v1 = 0, v2 = 0, v3 = 0;
		
		System.out.println("informe o 1° valor");
		v1 = ler.nextDouble();
		System.out.println("informe o 2° valor");
		v2 = ler.nextDouble();
		System.out.println("informe o 3° valor");
		v3 = ler.nextDouble();
		
		if (v1 == v2 && v1 == v3) {
			System.out.println("Todos são iguais");
		}
		else if (v1 > v2 && v1 > v3) {
			System.out.println("o 1° valor é o maior, seu numero é de: "+v1);
		}
		else if (v2 > v1 && v2 > v3) {
			System.out.println("o 2° valor é o maior, seu numero é de: "+v2);
		}
		else {
			System.out.println("o 3° valor é o maior, seu numero é de: "+v3);
		}
		} catch (Exception Erro) {
			System.out.println("Informe um valores numerico");
		}
		
	}
}

