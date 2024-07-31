package posafterferias;
import java.util.Scanner;
public class luansata {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double x;
		
		try {
		System.out.println("digite uma nota");
		x = ler.nextDouble();
		
		
		if (x>=6 && x<=10) {
			System.out.println("aprovado");
		}

		else if (x<6 && x>=4) {
			System.out.println("exame");
		}

		else {
			System.out.println("reprovado");
		}
		}catch (Exception Erro) {
			System.out.println("re-informe a nota de maneira correta (numerica, inteira, de 0 a 10)");
		}
	}

}
