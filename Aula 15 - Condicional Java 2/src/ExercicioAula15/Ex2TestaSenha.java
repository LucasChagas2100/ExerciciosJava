/* 2.	 Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. 
 * A senha v�lida � o n�mero 1234.  * Devem ser impressas as seguintes mensagens: 
 * ACESSO PERMITIDO caso a senha seja v�lida. ACESSO NEGADO caso a senha seja inv�lida.
*/

package ExercicioAula15;
import java.util.Scanner;

public class Ex2TestaSenha {
	public static void main(String[] args) {
		int senha;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Senha: ");
		senha = ler.nextInt();
		
		if (senha==1234) {
			System.out.println("ACESSO PERMITIDO");
		}
		else {
			System.out.println("ACESSO NEGADO");
		}
	}

}
