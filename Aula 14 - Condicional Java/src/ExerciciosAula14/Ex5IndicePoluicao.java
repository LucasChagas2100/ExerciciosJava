package ExerciciosAula14;
import java.util.Scanner;

public class Ex5IndicePoluicao {
	public static void main(String[] args) {
		double indice;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o índice de poluição medido: ");
		indice = ler.nextDouble();
		
		if (indice <0.3) {
			System.out.println("Índice de poluição aceitável!");
		}
		else if (indice >=0.3 && indice<0.4){
			System.out.println("Indústrias do grupo 1 devem suspender suas atividades!");
		}
		else if (indice >=0.4 && indice<0.5){
			System.out.println("Indústrias do grupo 1 e do grupo 2 devem suspender suas atividades!");
		}
		else if (indice >=0.5) {
			System.out.println("As indústrias dos três grupos devem suspender suas atividades!!!");
		}
	}

}
