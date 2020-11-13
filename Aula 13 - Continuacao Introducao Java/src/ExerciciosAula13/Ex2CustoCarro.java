package ExerciciosAula13;

import java.util.Scanner;

public class Ex2CustoCarro {
	public static void main(String[] args) {
		double custoFabrica, custoTotal;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o custo de fábrica do carro? ");
		custoFabrica = ler.nextDouble();
		custoTotal = (0.28+0.45)*custoFabrica + custoFabrica; //somatória de custos de distribuição e impostos
		System.out.println("O custo total do carro é: "+ custoTotal);
		
	}

}
