package ExerciciosAula14;
import java.util.Scanner;

public class Ex1Tomate {
	public static void main(String[] args) {
		double peso, excesso, multa;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o peso do tomate? ");
		peso = ler.nextDouble();
		if (peso>50) {
			excesso = peso-50;
			multa = 4.0*excesso;
			System.out.println("\nO excesso � de "+ excesso+ " quilos.");
			System.out.println("E a multa � de RS"+multa);
		}
		else {
			excesso=0;
			multa=0;
			System.out.println("Peso n�o excedido\nExcesso: "+excesso+"\nMulta: "+multa);
		}
	}

}
