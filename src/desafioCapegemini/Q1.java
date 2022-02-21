package desafioCapegemini;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//Scanner para leitura do valor 
		Scanner entrada = new Scanner (System.in);
		int n;
		String ast = "*";
		//Leitura do valor digitado pelo usuário e atribuição a variável n
		n = entrada.nextInt();
		//laço de repetição para cada valor do vetor
		for (int i = 0; i <= n; i++) {
			System.out.print("\n");
			//Laço de repetição aninhado com impressão dos valores
			for(int j = 0; j <= i-1; j++) {
				System.out.print(ast);
			}
		}
	}
}
