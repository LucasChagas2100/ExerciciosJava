/*7-	2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
 * e que se encontram no conjunto dos números de 1 até 500. (FOR)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex7SomaImparesTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somatoria=0;
		
		for(int i=1; i<=500; i++) {
			if (i%2==1 && i%3==0) {
				somatoria+=i;
				
			}
		}
		System.out.println(somatoria);
	}

}
