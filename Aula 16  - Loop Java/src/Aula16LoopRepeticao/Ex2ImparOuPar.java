//2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex2ImparOuPar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, impar=0, par=0;
		System.out.println("De dez valores, quantos s�o pares e quantos s�o �mpares");
		
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
		System.out.printf("\nH� %d valores pares e %d valores �mpares", par, impar);
	}

}
