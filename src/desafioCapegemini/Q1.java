package desafioCapegemini;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//Scanner para leitura do valor 
		Scanner entrada = new Scanner (System.in);
		int n;
		String ast = "*";
		//Leitura do valor digitado pelo usu�rio e atribui��o a vari�vel n
		n = entrada.nextInt();
		//la�o de repeti��o para cada valor do vetor
		for (int i = 0; i <= n; i++) {
			System.out.print("\n");
			//La�o de repeti��o aninhado com impress�o dos valores
			for(int j = 0; j <= i-1; j++) {
				System.out.print(ast);
			}
		}
	}
}
