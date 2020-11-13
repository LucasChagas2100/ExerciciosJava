package ExerciciosAula13;
import java.util.Scanner;

public class Ex6DiasParaIdade {
	public static void main(String[] args) {
		int anos, meses, dias, diasTotal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual sua idade total em dias?");
		diasTotal = ler.nextInt();
		anos = diasTotal/365;
		meses = (diasTotal%365)/30;
		dias = (diasTotal%365)%30;
		
		System.out.println("Sua idade é: "+ anos+ " ano(s), "+ meses +" mes(es) e "+ dias + " dia(s)");
		
	}

}
