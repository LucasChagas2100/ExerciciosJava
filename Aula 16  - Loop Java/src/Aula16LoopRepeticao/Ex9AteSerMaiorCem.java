/*9-	Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
 * até que ele seja maior do que 100. 
 * Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135. (WHILE)
 */


package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex9AteSerMaiorCem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextInt();
		while(valor<=100 && valor>0) {
			System.out.println(valor);
			valor*=3;
		}
		System.out.println(valor);
	}

}
