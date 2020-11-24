/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
package Aula19_POO;

public class Ex2Aviao {
	//Atributos
	private String porte;
	private String modelo;
	private int capacidadeTripulantes;
	private int capacidadePassageiros;
	
	//métodos
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
