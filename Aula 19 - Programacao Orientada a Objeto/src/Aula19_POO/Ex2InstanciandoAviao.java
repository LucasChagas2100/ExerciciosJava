package Aula19_POO;

import java.util.Scanner;

public class Ex2InstanciandoAviao {
	public static void main(String[] args) {
		//instaciando
		Ex2Aviao aviao1 = new Ex2Aviao();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o modelo do avião: ");
		aviao1.setModelo(ler.next());
		
		System.out.println("Digite o porte do avião: ");
		aviao1.setPorte(ler.next());
		
		System.out.println("Digite a capacidade de tripulantes do avião: ");
		aviao1.setCapacidadeTripulantes(ler.nextInt());
		
		System.out.println("Digite a capacidade de passageiros do avião: ");
		aviao1.setCapacidadePassageiros(ler.nextInt());
		
		System.out.println("Modelo: "+aviao1.getModelo());
		System.out.println("Porte: "+aviao1.getPorte());
		System.out.println("Capacidade de tripulantes: "+aviao1.getCapacidadeTripulantes());
		System.out.println("Capacidade de passageiros: "+aviao1.getCapacidadePassageiros());
		System.out.println("Capacidade total: "+(aviao1.getCapacidadePassageiros()+aviao1.getCapacidadeTripulantes()));
		
		ler.close();
	}

}
