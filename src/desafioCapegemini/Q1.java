package desafioCapegemini;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		System.out.print("Informe um valor inteiro: ");
		n = entrada.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.print("\n");
			for(int j = 0; j <= i-1; j++) {
				System.out.print("*");
			}
		}
		entrada.close();
	}
}

