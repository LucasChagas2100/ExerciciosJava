package ExerciciosAula14;
import java.util.Scanner;

public class Ex4ChecaNumero {
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro: ");
		numero = ler.nextInt();
		System.out.println("\n\n");
		if (numero%2==0) {
			System.out.println(numero+" � par");
		}
		else {
			System.out.println(numero+" � impar");
		}
		if (numero>=0) {
			System.out.println("e positivo");
		}
		else {
			System.out.println("e negativo");
		}
	}

}
