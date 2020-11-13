package ExerciciosAula13;
import java.util.Scanner;

public class Ex3EquacaoD {
	public static void main(String[] args) {
		int a, b, c;
		double r, s, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor de A: ");
		a = ler.nextInt();
		System.out.println("Qual o valor de B: ");
		b = ler.nextInt();
		System.out.println("Qual o valor de C: ");
		c = ler.nextInt();
		
		r= Math.pow(a+b,2);
		s= Math.pow(b+c, 2);
		d= (r+s)/2;
		
		System.out.println("O resultado da equação é: "+ d);
	}

}
