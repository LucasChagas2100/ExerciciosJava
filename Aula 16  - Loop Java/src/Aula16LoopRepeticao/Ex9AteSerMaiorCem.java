/*9-	Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  (imprimindo o novo valor) 
 * at� que ele seja maior do que 100. 
 * Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135. (WHILE)
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
