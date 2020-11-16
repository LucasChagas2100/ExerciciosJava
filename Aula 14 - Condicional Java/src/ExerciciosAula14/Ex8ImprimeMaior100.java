package ExerciciosAula14;
import java.util.Scanner;

public class Ex8ImprimeMaior100 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println("Entre com um valor: ");
		num = ler.nextDouble();
		System.out.println("\n\n");
		
		if (num>100) {
			System.out.println(num);
		}
		else {
			num = 0;
			System.out.println(num);
		}
	}

}
