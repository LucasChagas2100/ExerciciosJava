package ExerciciosAula14;
import java.util.Scanner;

public class Ex7AreaTriangulo {
	public static void main(String[] args) {
		int altura, base;
		double area=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com os valores do tri�ngilo...\nBase: ");
		base = ler.nextInt();
		System.out.println("Altura: ");
		altura = ler.nextInt();
		
		if(base<0 || altura<0) {
			System.out.println("Valores inv�lidos!");
		}
		else {
			area = (base*altura)/2.0;
			System.out.println("A �rea do tri�ngulo �: "+ area+"m�");
		}
	}

}
