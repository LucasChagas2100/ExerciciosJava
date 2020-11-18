/*8- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o total do somat�rio, 
 * a m�dia e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo 
 * valores positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo. (WHILE)
 */
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex8LeiaValores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, somatorio=0, contadorMedia=0;
		double media;
		
		System.out.println("Entre com um valor: ");
		valor = ler.nextInt();
		while(valor>=0) {
			somatorio+=valor;
			contadorMedia++;
			System.out.println("Entre com um valor: ");
			valor = ler.nextInt();
		}
		
		System.out.println("Somat�rio: "+somatorio);
		media = (double) somatorio/contadorMedia;
		System.out.println("M�dia: "+media);
		System.out.println("Quantidade de valores lidos: "+contadorMedia);//contador m�dia = quantos valores foram lidos
		
	}

}
