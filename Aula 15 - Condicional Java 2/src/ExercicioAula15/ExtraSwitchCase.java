package ExercicioAula15;
import java.util.Scanner;

public class ExtraSwitchCase {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("Exemplo de funcionalidade do Switch-Case");
		System.out.println("Entre com um dígito para navegar no Menu");
		System.out.println("\n1.Início");
		System.out.println("\n2.Meu perfil");
		System.out.println("\n3.Configurações");
		System.out.println("\n4.Sair\n");
		
		opcao = ler.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Link 1: Acessando o início da página principal");
			break;
		case 2:
			System.out.println("Link 2: Acessando o perfil do usuário");
			break;
		case 3:
			System.out.println("Link 3: Acessando as configurações");
			break;
		case 4:
			System.out.println("Link 4: Logout da página");
			break;
		default:
			System.out.println("Link inválido");
			break;
		}
	
	}

}
