/*6. Implemente a classe Vendedor como subclasse da classe Pessoa. 
 * Um determinado vendedor tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como 
 * valorVendas (correspondente ao valor monet�rio dos artigos vendidos) 
 * e o atributo comissao (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor). 
 */
package DesafioPOO;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	//Testando chamar construtor com poucas vari�veis
	public Vendedor(String nome, double valorVendas, double comissao) {
		super(nome);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaComissao(double valorVendas, double comissao) {
		return (valorVendas*comissao);
	}
	

}
