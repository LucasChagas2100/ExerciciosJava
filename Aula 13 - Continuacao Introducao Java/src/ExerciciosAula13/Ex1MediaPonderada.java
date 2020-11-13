package ExerciciosAula13;

import java.util.Scanner; //importando função 'Scanner' da biblioteca 'util'

public class Ex1MediaPonderada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //A variável ler pode ter qualquer nome
		double nota1, nota2, nota3, media;
		final int peso1 = 2, peso2 = 3, peso3 = 5;
		System.out.println("Entre com a nota 1: ");
		nota1 = ler.nextDouble();
		System.out.println("Entre com a nota 2: ");
		nota2 = ler.nextDouble();
		System.out.println("Entre com a nota 3: ");
		nota3 = ler.nextDouble();
		
		media = (nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
		System.out.println("A média das notas é: " + media);
	}

}
