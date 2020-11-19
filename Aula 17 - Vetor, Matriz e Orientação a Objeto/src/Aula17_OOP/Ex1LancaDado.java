/*1.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
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
			//lendo lançamentos
			System.out.printf("\nValor do lançamento[%d]: ",i+1);
			valor[i]= ler.nextInt();
			//somatória da média
			somadorMedia += valor[i];
			//descobrindo o maior
			if(valor[i]>maior) {
				maior = valor[i];
			}
		}
		//media
		media = (float) somadorMedia/valor.length; //divisor da média = quantidade de lançamentos = tamanho do vetor
		System.out.printf("\nMédia dos lançamentos: %.1f", media);
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
