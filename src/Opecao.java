import java.util.Scanner;

public class Opecao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double primeiroValor, segundoValor, soma, subtracao, divisao, multiplicacao;
		System.out.println("Por favor, digite o número");
		primeiroValor = leitor. nextDouble() ;
		System.out.println("Por favor, digite o segundo valor");
		segundoValor = leitor. nextDouble() ;
		divisao = primeiroValor / segundoValor;
		System.out.println("Total " + divisao);

		leitor.close();

	}

}
