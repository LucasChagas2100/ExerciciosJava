/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 *em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */
package Aula19_POO;

public class Ex3Eletronico {
	//Atributos
	private String tipo;
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	private int tensao;
	
	//M�todos
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	

}
