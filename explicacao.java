package posafterferias;

import java.util.ArrayList;
import java.util.Scanner;
public class explicacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> teste = new ArrayList<>();
	
		System.out.println("Digite 0 para para");
		System.out.println("############################");
		
		int i=1,soma=0;
		while(i!=0) {
		
		System.out.println("informe o valor a ser somado: ");
		i = ler.nextInt();
		teste.add(i);
		
	}
		for(int n: teste){
		soma = soma + n;
		System.out.println("a soma é: "+soma);
	
		}
	
	}
		

	}
