package ExercicioAula15;
import java.util.Scanner;

public class ExtraSwitchCase {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("Exemplo de funcionalidade do Switch-Case");
		System.out.println("Entre com um d�gito para navegar no Menu");
		System.out.println("\n1.In�cio");
		System.out.println("\n2.Meu perfil");
		System.out.println("\n3.Configura��es");
		System.out.println("\n4.Sair\n");
		
		opcao = ler.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Link 1: Acessando o in�cio da p�gina principal");
			break;
		case 2:
			System.out.println("Link 2: Acessando o perfil do usu�rio");
			break;
		case 3:
			System.out.println("Link 3: Acessando as configura��es");
			break;
		case 4:
			System.out.println("Link 4: Logout da p�gina");
			break;
		default:
			System.out.println("Link inv�lido");
			break;
		}
	
	}

}
