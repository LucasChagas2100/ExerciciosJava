/*3. * As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, 
 * e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra.
 * 
 */
package ExercicioAula15;
import java.util.Scanner;
import java.math.*;
public class Ex3CustoMaca {
	public static void main(String[] args) {
		int quantidade;
		double custo;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas ma��s foram compradas: ");
		quantidade = ler.nextInt();
		
		if (quantidade<12) {
			custo = 0.30;
			System.out.printf("\nO custo total �: RS %.2f", custo*quantidade );
		}
		else if(quantidade>=12) {
			custo = 0.25;
			System.out.printf("\nO custo total �: RS %.2f", custo*quantidade );
		}
	}

}
