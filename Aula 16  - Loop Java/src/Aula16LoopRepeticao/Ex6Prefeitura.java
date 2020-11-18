/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 *coletando dados sobre o sal�rio e n�mero de filhos.  * A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.  (FOR)
*/
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex6Prefeitura {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, somaSalario=0, mediaSalario, mediaFilhos, maiorSalario=0, percentualAteCem;
		int filhos, somaFilhos=0, ateCem = 0;
		
		for (int i=0; i<20; i++) {
			System.out.printf("\nHabitante %d: \nQual o sal�rio: ", i+1);
			salario= ler.nextDouble();
			System.out.println("\nQuantos filhos? ");
			filhos = ler.nextInt();
			somaSalario+=salario;
			somaFilhos+=filhos;
			if (salario>maiorSalario) {
				maiorSalario= salario;
			}
			if (salario<=100) {
				ateCem++;
			}
			
		}
		mediaSalario= somaSalario/20.0;
		mediaFilhos= somaFilhos/20.0;
		percentualAteCem = (ateCem/20.0)*100.0;
		System.out.printf("\n- M�dia de sal�rio dos habitantes: R$ %.2f",mediaSalario);
		System.out.println("\n- M�dia de filhos dos habitantes: "+mediaFilhos);
		System.out.printf("- Maior sal�rio: R$ %.2f", maiorSalario);
		System.out.println("\n- Percentual de pessoas com sal�rio at� R$100,00: "+percentualAteCem+"%");
	}

}
