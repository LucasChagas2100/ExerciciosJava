/*5.Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. 
−   Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
−   Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. 
*/
package ExercicioAula15;

import java.util.Scanner;

public class Ex5DefinePoligono2 {
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
			return;
		}
		else if (lados==4) {
			area= medida*medida;
			System.out.printf("\nQUADRADO -> Área: %.2f",area);
		}
		else if (lados==5) {
			System.out.println("\nPENTÁGONO");
		}
		else if (lados<3) {
			System.out.println("Não é um polígono");
		}
		else if (lados>5) {
			System.out.println("Polígono não identificado");
		}
	}

}
