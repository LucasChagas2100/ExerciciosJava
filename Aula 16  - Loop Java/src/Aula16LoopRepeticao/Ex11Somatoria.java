/*11-	Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
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
