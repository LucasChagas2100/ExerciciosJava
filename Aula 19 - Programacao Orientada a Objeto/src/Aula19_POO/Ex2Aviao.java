/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */
package Aula19_POO;

public class Ex2Aviao {
	//Atributos
	private String porte;
	private String modelo;
	private int capacidadeTripulantes;
	private int capacidadePassageiros;
	
	//m�todos
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidadeTripulantes() {
		return capacidadeTripulantes;
	}
	public void setCapacidadeTripulantes(int capacidadeTripulantes) {
		this.capacidadeTripulantes = capacidadeTripulantes;
	}
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	
	

}
