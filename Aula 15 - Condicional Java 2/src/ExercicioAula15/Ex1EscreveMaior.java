package ExercicioAula15;
import java.util.Scanner;

public class Ex1EscreveMaior {
	public static void main(String[] args) {
		int valor1, valor2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com os valores\nValor1: ");
		valor1 = ler.nextInt();
		System.out.println("Valor2: ");
		valor2 = ler.nextInt();
		//teste de igualdade
		if (valor1==valor2) {
			System.out.println("Valores iguais!! Entre com um novo valor2: ");
			valor2 = ler.nextInt();
		}
		//teste de qual é maior
		if (valor1>valor2) {
			System.out.println("O valor maior é o "+valor1);
		}
		else if(valor2>valor1) {
			System.out.println("O valor maior é o "+valor2);
		}
		else {
			System.out.println("Valor igual novamente. Fim do programa");
		}
	}

}
