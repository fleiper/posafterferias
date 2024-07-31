package posafterferias;
import java.util.Scanner;
public class depoisdointervalo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a,c,b;
		
		a=10;
		System.out.println("digite um numero");
		b = ler.nextInt();
		
		try {
			c=a/b;
			System.out.println("o valor de C é de" +c);
		} catch (Exception erro) {
			System.out.println("Não existe numero divisivel por 0");
	
		}

	}

}
