package ExerciciosAula13;
import java.util.Scanner;

public class Ex4ConverterTempo {
	public static void main(String[] args) {
		int segundosTotal, horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos segundos terá o evento? ");
		segundosTotal = ler.nextInt();
		
		if(segundosTotal>=3600) {
			horas = segundosTotal/3600;
			minutos = (segundosTotal%3600)/60;
			segundos = (segundosTotal%3600)%60;
		}
		else if(segundosTotal>=60) {
			horas = 0;
			minutos = segundosTotal/60;
			segundos = segundosTotal%60;
		}
		else {
			horas = 0;
			minutos = 0;
			segundos = segundosTotal;
		}
		
		System.out.println("O evento terá duração de " + horas + "hr: "+ minutos + "min: "+ segundos + "s");
		
	}

}
