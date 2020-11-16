package ExerciciosAula14;
import java.util.Scanner;

public class Ex3Ler4Numeros {
	public static void main(String[] args) {
		int num1, num2, num3, num4;
		double quad1, quad2, quad3, quad4;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		num3 = ler.nextInt();
		System.out.println("Entre com o quarto número: ");
		num4 = ler.nextInt();
		quad1 = Math.pow(num1, 2);
		quad2 = Math.pow(num2, 2);
		quad3 = Math.pow(num3, 2);
		quad4 = Math.pow(num4, 2);
		
		if (quad3>1000) {
			System.out.println(quad3 + " é maior que 1000... fim!");
		}
		else {
			System.out.println(num1+" --> "+quad1);
			System.out.println(num2+" --> "+quad2);
			System.out.println(num3+" --> "+quad3);
			System.out.println(num4+" --> "+quad4);
		}
	}

}
