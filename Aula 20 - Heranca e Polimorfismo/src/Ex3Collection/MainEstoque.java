/*3-	Crie uma um programa para trabalhar com estoque de uma loja, 
o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/
package Ex3Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainEstoque {
	public static void main(String[] args) {
		int opcao=0, quantidade=0;
		double valorCompra=0;
		Scanner ler = new Scanner (System.in);
		Set<Estoque> conjunto1 = new HashSet<Estoque>();
		//Instanciando
		Estoque coxinha = new Estoque("Coxinha", 200, "Geladeira 03", 1.99);
		Estoque pastel = new Estoque("Pastel", 50, "Geladeira 01", 5.99);
		Estoque refri = new Estoque("Refrigerante", 100, "Freezer 01", 5.99);
		Estoque kibe = new Estoque("Kibe", 19, "Geladeira 01", 1.99);
		
		//Armazenando dados
		System.out.println("Adicionando os itens para a lista do estoque: coxinha, pastel, refrigerante e kibe");
		conjunto1.add(coxinha);
		conjunto1.add(pastel);
		conjunto1.add(refri);
		conjunto1.add(kibe);
		
		System.out.println(conjunto1);
		
		//Removendo dados
		System.out.println("Kibe não é muito vendido, iremos retirá-lo do catálogo");
		conjunto1.remove(kibe);//Kibe é ruim, portanto vamos retira-lo.
		System.out.println(conjunto1);
		
		//Início das vendas
		while (opcao!=4) {
			System.out.println("\n\n\n**** Vendas de produtos ****");
			System.out.printf("Valor da compra: R$%.2f\n",valorCompra);
			System.out.println("Digite a opção do produto vendido? ");
			System.out.println("1. Coxinha\n2. Pastel\n3. Refrigerante\n4. Sair ");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Qual a quantidade: ");
				quantidade = ler.nextInt();
				valorCompra += (quantidade*coxinha.getPreco());
				coxinha.calculaQuantidade(quantidade);
				break;
			case 2:
				System.out.println("Qual a quantidade: ");
				quantidade = ler.nextInt();
				valorCompra += (quantidade*pastel.getPreco());
				pastel.calculaQuantidade(quantidade);
				break;
			case 3:
				System.out.println("Qual a quantidade: ");
				quantidade = ler.nextInt();
				valorCompra += (quantidade*refri.getPreco());
				refri.calculaQuantidade(quantidade);
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Valor inválido, digite novamente...\n");
				break;
			}
		}
		System.out.printf("Valor total da compra: R$%.2f\n", valorCompra);
		System.out.println(conjunto1);
		
		ler.close();
	}
	
}
