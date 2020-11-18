/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex3SolicitaIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0, menor21=0, maior50=0;
		
		while(idade!=-99) {
			System.out.println("Qual a idade: ");
			idade = ler.nextInt();
			if (idade<21 && idade>=0) {
				menor21++;
			}
			if (idade>50) {
				maior50++;
			}
			System.out.printf("\n\nHá %d pessoa(s) com menos de 21 anos e %d pessoa(s) com mais de 50 anos\n\n\n", menor21, maior50);
		}
	}

}
