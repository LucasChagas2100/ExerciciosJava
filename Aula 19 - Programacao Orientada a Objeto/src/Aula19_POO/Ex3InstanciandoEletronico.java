package Aula19_POO;

import java.util.Scanner;

public class Ex3InstanciandoEletronico {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex3Eletronico produto1 = new Ex3Eletronico();
		
		System.out.println("Tipo do produto: ");
		produto1.setTipo(ler.next());
		
		System.out.println("Nome do produto: ");
		produto1.setNome(ler.next());
		
		System.out.println("Modelo do produto: ");
		produto1.setMarca(ler.next());
		
		System.out.println("Tens�o do produto: ");
		produto1.setTensao(ler.nextInt());
		
		System.out.println("Pre�o do produto: ");
		produto1.setPreco(ler.nextDouble());
		
		System.out.println("Quantidade do produto desejada: ");
		produto1.setQuantidade(ler.nextInt());
		
		
		
		System.out.println("\nRevis�o do pedido: ");
		System.out.println("Tipo do produto: "+ produto1.getTipo());
		System.out.println("Nome do produto: "+ produto1.getNome());
		System.out.println("Modelo do produto: "+ produto1.getMarca());
		System.out.println("Tens�o do produto: "+ produto1.getTensao()+"V");
		System.out.printf("Pre�o do produto: R$ %.2f\n", produto1.getPreco());
		System.out.println("Quantidade do produto desejada: "+ produto1.getQuantidade());
		
	}

}
