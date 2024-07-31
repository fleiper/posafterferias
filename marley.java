package posafterferias;
import java.util.Scanner;
import java.util.ArrayList;
public class marley {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		Scanner ler = new Scanner (System.in);
		try {
		int nome;
		System.out.println("em que posição o nome que você deseja está?: ");
		nome = ler.nextInt();
		nomes.add("alice");
		nomes.add("bob");
		nomes.add("charlie");

		System.out.println("nome:" +nomes.get(nome));
		}catch (Exception Erro) {
			System.out.println("não existe nome salvo no numero citado");
		}
	}

}
