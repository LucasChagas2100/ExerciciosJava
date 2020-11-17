/*6.Escreva um programa para ler 3 valores inteiros e escrever o maior deles. 
 * Considere que o usuário não informará valores iguais.
 */
package ExercicioAula15;
import java.util.Scanner;
public class Ex6MaiorDeTres {
	public static void main(String[] args) {
		int valor1, valor2, valor3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os valores (Não podem ser iguais)\n\nValor1: ");
		valor1 = ler.nextInt();
		System.out.println("Valor2: ");
		valor2 = ler.nextInt();
		System.out.println("Valor3: ");
		valor3 = ler.nextInt();
		
		if (valor1>valor2 && valor1>valor3) {
			System.out.println("O maior valor é o primeiro: "+valor1);
		}
		else if(valor2>valor1 && valor2>valor3) {
			System.out.println("O maior valor é o segundo: "+valor2);
		}
		else if(valor3>valor1 && valor3>valor2) {
			System.out.println("O maior valor é o terceiro: "+valor3);
		}
		else {
			System.out.println("Há valores iguais... fim do programa!");
		}
	}

}
