package ExerciciosAula14;
import java.util.Scanner;

public class Ex2CalculaSalario {
	public static void main(String[] args) {
		String codigo;
		double horas, HE, salarioNormal, salarioHE, salarioTotal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o código: ");
		codigo= ler.nextLine();
		System.out.println("Entre com o número de horas trabalhadas: ");
		horas = ler.nextDouble();
		
		if (horas>50) {
			HE = horas-50;
			salarioNormal = 50*10.0;
			salarioHE = HE*20.0;
			salarioTotal = salarioNormal + salarioHE;
			
			System.out.println("Salario normal: "+salarioNormal);
			System.out.println("Salario extra: "+salarioHE+ "\n---------->");
			System.out.println("Salario total: "+ salarioTotal);
		}
		else if (horas<=50) {
			HE = 0;
			salarioHE = 0.0;
			salarioNormal = horas*10.0;
			salarioTotal = salarioNormal + salarioHE;
			
			System.out.println("Salario normal: "+salarioNormal);
			System.out.println("Salario extra: "+salarioHE+ "\n---------->");
			System.out.println("Salario total: "+ salarioTotal);
		}
	}

}
