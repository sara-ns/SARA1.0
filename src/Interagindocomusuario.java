import java.util.Scanner;

public class Interagindocomusuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String  nomeUsuario;
		System.out.println("Olá me chamo Sara. Por favor, digite o seu nome!");
		nomeUsuario = leitor.next() ;
		System.out.println("Obrigada por interagir comigo, " + nomeUsuario + "! Como posso te ajudar?");
		
		leitor.close();
		
		
		
		

	}

}
