/*11-	Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex11Somatoria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, somatorio=0;
		
		System.out.println("Qual o valor: ");
		valor = ler.nextInt();
		do {
			somatorio+=valor;
			valor--;
		} while(valor>0);
		System.out.println(somatorio);
	}
	

}
