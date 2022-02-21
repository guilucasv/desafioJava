package desafioCapegemini;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Q2 {
	public static int main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe um valor:");
		String senha = entrada.nextLine();
		boolean senhaValida = true;
     
        Pattern checkDigito = Pattern.compile("(.)*(\\d)(.)*");
        boolean containsNumber = checkDigito.matcher(senha).matches();

		Pattern checkMinusculo = Pattern.compile("^(?=.*[a-z]).+$");
		boolean containsMinusculo = checkMinusculo.matcher(senha).matches();

		Pattern checkMaiusculo = Pattern.compile("^(?=.*[A-Z]).+$");
		boolean containsMaiusculo = checkMaiusculo.matcher(senha).matches();

		Pattern checkEspecial = Pattern.compile("^[^!@#$%&*()-+].+$");
		boolean containsEspecial = checkEspecial.matcher(senha).matches();
		

		if ( senha.length() < 6 ) {
			System.out.println("Sua senha nao contem 6 caracteres.");
			senhaValida = false;
		}else if(containsNumber == false) {
			System.out.println("E obrigatorio conter um digito em sua senha");
			senhaValida = false;
		}else if(containsMinusculo == false) {
			System.out.println("E obrigatorio conter uma letra minuscula");
			senhaValida = false;
		}else if(containsMaiusculo == false) {
			System.out.println("E obrigatorio conter uma letra maiuscula");
			senhaValida = false;
		}else if(containsEspecial == false) {
			System.out.println("E obrigatorio conter um caracter especial: !@#$%^&*()-+ ");
			senhaValida = false;
		}
		entrada.close();
		if (senhaValida = true) {
			return 0;
		}
		System.out.println("Senha Valida");		
		return 1;
	}
}

