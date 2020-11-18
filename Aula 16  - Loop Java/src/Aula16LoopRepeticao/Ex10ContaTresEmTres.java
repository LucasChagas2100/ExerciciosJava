/*10-	Faça um programa que mostre uma contagem na tela de 233 a 456, 
 * só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver. (DO...WHILE)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex10ContaTresEmTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor=233;
		
		do {
			
			if(valor>300 && valor<400) {
				System.out.println(valor);
				valor+=3;
			}
			else {
				System.out.println(valor);
				valor+=5;
			} 
		} while(valor<=456);
	}

}
