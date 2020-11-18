/*4- Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex4SomaValores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, soma=0;
		do {
			System.out.println("Digite um valor: ");
			valor = ler.nextInt();
			soma+=valor;
		} while (valor!=0);
		System.out.println("A soma dos valores digitados é: "+ soma);
	}

}
