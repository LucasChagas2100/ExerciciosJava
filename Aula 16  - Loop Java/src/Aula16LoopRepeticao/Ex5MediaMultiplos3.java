/*5- Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 *E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex5MediaMultiplos3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, somatoria=0; 
		double media=0, divisor=0;
		do {
			System.out.println("Digite um valor: ");
			valor = ler.nextInt();
			if (valor%3==0 && valor!=0) {
				somatoria+=valor;
				divisor++;
			}
			
		} while (valor!=0);
		media = somatoria/divisor;
		System.out.println("A m�dia dos valores m�ltiplos de 3 �: "+ media);
	}

}
