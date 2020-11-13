package ExerciciosAula13;
import java.util.Scanner;

public class Ex5IdadeParaDias {
	public static void main(String[] args) {
		int anos, meses, dias, diasAno, diasMes, diasTotal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual sua idade em anos, meses e dias?");
		System.out.println("Anos: ");
		anos = ler.nextInt();
		System.out.println("Meses: ");
		meses = ler.nextInt();
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		diasAno = anos*365;
		diasMes = meses*30;
		diasTotal = dias + diasMes + diasAno;
		System.out.println("A quantidade de dias totais é de: "+ diasTotal);
		
	}

}
