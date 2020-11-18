//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex2ImparOuPar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, impar=0, par=0;
		System.out.println("De dez valores, quantos são pares e quantos são ímpares");
		
		for(int i=0; i<10; i++) {
			System.out.printf("\n\nEntre com o valor%d: ", i+1);
			valor= ler.nextInt();
			if(valor%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("\nHá %d valores pares e %d valores ímpares", par, impar);
	}

}
