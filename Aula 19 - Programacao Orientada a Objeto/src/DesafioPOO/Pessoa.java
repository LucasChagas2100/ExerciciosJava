/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), 
 * e ainda o construtor padr�o e pelo menos mais duas op��es de construtores conforme sua percep��o. 
 * Atributos: String nome; String endere�o; String telefone; 
 */
package DesafioPOO;

public class Pessoa {
	//Atributos:
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		//super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Criar mais dois construtores (Um sem telefone e outro s� com o nome
	public Pessoa(String nome, String endereco) { //Um construtor que s� h� dois argumentos
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	public Pessoa(String nome) { //Um construtor que s� h� dois argumentos
		super();
		this.nome = nome;
	}
	
	
	//Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
