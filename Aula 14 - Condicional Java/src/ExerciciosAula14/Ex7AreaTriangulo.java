package ExerciciosAula14;
import java.util.Scanner;

public class Ex7AreaTriangulo {
	public static void main(String[] args) {
		int altura, base;
		double area=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com os valores do triângilo...\nBase: ");
		base = ler.nextInt();
		System.out.println("Altura: ");
		altura = ler.nextInt();
		
		if(base<0 || altura<0) {
			System.out.println("Valores inválidos!");
		}
		else {
			area = (base*altura)/2.0;
			System.out.println("A área do triângulo é: "+ area+"m²");
		}
	}

}
