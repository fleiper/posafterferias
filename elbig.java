package posafterferias;
import java.util.Scanner;
public class elbig {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int a, b;
		
		try {
		System.out.println("insira o primeiro valor");
		a = ler.nextInt();
		
		
		System.out.println("insira o segundo valor");
		b = ler.nextInt();
		
		
	
		System.out.println("resultados");
		
		System.out.println("soma "+(a+b));
		
		System.out.println("substração"+(a-b));
		
		System.out.println("multiplicação"+(a*b));
		
		System.out.println("divisão"+(a%b));
		
		System.out.println("divisão exata"+((double)a/b));
		}catch (Exception Erro) {
			System.out.println("informe um valor do tipo inteiro");
			System.exit(0);
		
		} 
		
			
		}
		
		
		
	}

