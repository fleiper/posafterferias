package posafterferias;
import java.util.Scanner;
import java.util.ArrayList;
public class meiodia {

	public static void main(String[] args) {
		ArrayList<Integer> dez = new ArrayList<>();
		Scanner ler = new Scanner (System.in);

		int lista,valor=0,soma=0;
		
		System.out.println("Quantas valores vocÊ deseja incrementar na lista?");
		lista = ler.nextInt();
		
		for(int a =0; a<lista; a++) {
			System.out.println("informe um valor");
			valor = ler.nextInt();;
			dez.add(valor);
		}
		
		System.out.println(dez);
		System.out.println("-----------------------------------");

		for (int num : dez) {
			if (lista%2 ==0) {
				System.out.println("ele é numero par");
			
			}
			else {
				System.out.println("ele é um numero par");
			}
			System.out.println(soma);


		}
	}
}