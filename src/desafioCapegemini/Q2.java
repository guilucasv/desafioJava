package desafioCapegemini;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner entrada = new Scanner (System.in);
		String senha;
		int tamanhoSenha;
		senha = entrada.nextLine();
		
		tamanhoSenha = senha.length();
		//Condição de satição da senha
		if (tamanhoSenha >= 6 ) {
			
			System.out.print("Senha OK");
		}
		else {
	
			System.out.print(6 - tamanhoSenha);
		}
	}
}

