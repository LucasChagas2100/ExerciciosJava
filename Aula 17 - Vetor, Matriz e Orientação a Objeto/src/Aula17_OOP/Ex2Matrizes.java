/*2.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/
package Aula17_OOP;

import java.util.Scanner;

public class Ex2Matrizes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		//lendo n1 e n2
		for (int l=0; l<N1.length; l++) { //N1.lenght dá a quantidade de linhas da matriz
			for(int c=0; c<N1[0].length; c++) {//N1[0].lenght dá a quantidade de colunas da matriz, especificamente, tamanho da primeira linha
				System.out.printf("\nN1[%d][%d]: ",l,c);
				N1[l][c] = ler.nextInt();
			}
		}
		for (int l=0; l<N2.length; l++) { 
			for(int c=0; c<N2[0].length; c++) {
				System.out.printf("\nN2[%d][%d]: ",l,c);
				N2[l][c] = ler.nextInt();
			}
		}
		//System.out.println("tamanho da linha: "+N1.length +"tamanho da coluna: "+ N1[0].length); //testa tamanho de linha-coluna
		
		//obtendo matrizes m1 e m2
		for (int l=0; l<N2.length; l++) { //tamanho de n1 e n2 são os mesmos. por isso pode usar o N1.length ou o N2.length
			for(int c=0; c<N2[0].length; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		//exibindo matrizes m1
		System.out.println("\nM1 =");
		for (int l=0; l<M1.length; l++) { //tamanho de m1 e m2 são os mesmos. por isso pode usar o M1.length ou o M2.length
			for(int c=0; c<M1[0].length; c++) {
				System.out.printf("\t %d ",M1[l][c]);
			}
			System.out.println();//ir pra próxima linha da matriz
		}
		//exibindo matrizes m2
		System.out.println("\nM2 =");
		for (int l=0; l<M2.length; l++) { //tamanho de m1 e m2 são os mesmos. por isso pode usar o M1.length ou o M2.length
			for(int c=0; c<M2[0].length; c++) {
				System.out.printf("\t %d ",M2[l][c]);
			}
			System.out.println();//ir pra próxima linha da matriz
		}
		ler.close();
	}

}
