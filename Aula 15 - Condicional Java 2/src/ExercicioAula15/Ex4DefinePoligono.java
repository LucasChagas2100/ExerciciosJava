/*4.	. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). 
 * Calcular e imprimir o seguinte:
− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área 
− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
− Se o número de lados for igual a 5 escrever PENTÁGONO.
 */
package ExercicioAula15;
import java.util.Scanner;
import java.math.*;
public class Ex4DefinePoligono {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lados, medida;
		double area=0;
		
		System.out.println("Qual o número de lados do polígono regular: ");
		lados = ler.nextInt();
		System.out.println("Qual a medida dos lados: ");
		medida = ler.nextInt();
		
		if (lados ==3) {
			area= medida*2/2;
			System.out.printf("\nTRIÂNGULO -> Área: %.2f", area);
			
		}
		else if (lados==4) {
			area= medida*medida;
			System.out.printf("\nQUADRADO -> Área: %.2f",area);
		}
		else if (lados==5) {
			System.out.println("\nPENTÁGONO");
		}
		else {
			System.out.println("Valor de lados inválido");
		}
	}

}
