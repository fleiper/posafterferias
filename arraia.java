package posafterferias;
import java.util.ArrayList;
import java.util.Scanner;
public class arraia {
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
			soma = soma+valor;

		}
		System.out.println(dez);
		System.out.println("-----------------------------------");

		for (int num : dez) {
			System.out.println(soma);


		}

	}
}