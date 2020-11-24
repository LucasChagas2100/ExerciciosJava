package DesafioPOO;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Testa fornecedor
		System.out.println("Testando classe Fornecedor...\n");
		Fornecedor mateus = new Fornecedor("Mateus", "Sem endereço", "19 91234-5678"); //Testando Herança SUPER
		
		System.out.println(mateus.getNome()+", Qual seu crédito: ");
		mateus.setValorCredito(ler.nextDouble());
		System.out.println("Qual sua dívida: ");
		mateus.setValorDivida(ler.nextDouble());
		
		System.out.println("Saldo: "+ mateus.obterSaldo(mateus.getValorCredito(), mateus.getValorDivida()));
		
		//Testa Empregado
		System.out.println("\n\nTestando classe Empregado...\n");
		Empregado chagas = new Empregado("Chagas", "Sem endereço", "19 99999-1234", 123, 6000, 0.2);
		System.out.println(chagas.getNome()+"\nCálculo do salário: "+ chagas.calcularSalario(chagas.getSalarioBase(), chagas.getImposto()));
		
		//Testa Adm
		System.out.println("\n\nTestando classe Administrador...\n");
		Administrador lucas = new Administrador("Lucas", "Rua das amélias 123", "19 90909-9090", 1700.00);
		System.out.println(lucas.getNome()+" - Ajuda de custo: "+ lucas.toString());
		
		//testaOperario
		System.out.println("\n\nTestando classe Operário...\n");
		Operario correa = new Operario ("Correa","Rua Vinte e Um 22", "## 34567-8900", 30000, 0.01);
		System.out.println(correa.getNome()+" - Comissão: "+ correa.calculaComissao(correa.getValorProducao(), correa.getComissao()));
		
		//testa Vendedor
		System.out.println("\n\nTestando classe Vendedor...\n");
		Vendedor vaz = new Vendedor("Vaz", 100000, 0.04);
		System.out.println(vaz.getNome()+" - Comissão: "+ vaz.calculaComissao(vaz.getValorVendas(), vaz.getComissao()));
	}

}
