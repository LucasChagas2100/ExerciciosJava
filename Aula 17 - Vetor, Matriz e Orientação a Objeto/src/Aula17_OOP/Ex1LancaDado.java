/*1.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
 * contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
 */
package Aula17_OOP;

import java.util.Scanner;

public class Ex1LancaDado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] valor = new int[5];
		int somadorMedia = 0, maior=0, contaMaior=0;
		double media;
		
		for (int i=0; i<valor.length; i++) {
			//lendo lan�amentos
			System.out.printf("\nValor do lan�amento[%d]: ",i+1);
			valor[i]= ler.nextInt();
			//somat�ria da m�dia
			somadorMedia += valor[i];
			//descobrindo o maior
			if(valor[i]>maior) {
				maior = valor[i];
			}
		}
		//media
		media = (float) somadorMedia/valor.length; //divisor da m�dia = quantidade de lan�amentos = tamanho do vetor
		System.out.printf("\nM�dia dos lan�amentos: %.1f", media);
		//quantidade que caiu o maior
		for (int i=0; i<valor.length; i++) {
			if (valor[i] == maior) {
				contaMaior++;
			}
		}
		
		System.out.printf("\nQuantidade que o maior valor [%d] caiu: %d",maior, contaMaior);
		
		ler.close();
	}

}
