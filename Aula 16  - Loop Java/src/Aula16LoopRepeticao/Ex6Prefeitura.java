/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 *coletando dados sobre o salário e número de filhos.  * A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  (FOR)
*/
package Aula16LoopRepeticao;

import java.util.Scanner;

public class Ex6Prefeitura {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, somaSalario=0, mediaSalario, mediaFilhos, maiorSalario=0, percentualAteCem;
		int filhos, somaFilhos=0, ateCem = 0;
		
		for (int i=0; i<20; i++) {
			System.out.printf("\nHabitante %d: \nQual o salário: ", i+1);
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
		System.out.printf("\n- Média de salário dos habitantes: R$ %.2f",mediaSalario);
		System.out.println("\n- Média de filhos dos habitantes: "+mediaFilhos);
		System.out.printf("- Maior salário: R$ %.2f", maiorSalario);
		System.out.println("\n- Percentual de pessoas com salário até R$100,00: "+percentualAteCem+"%");
	}

}
