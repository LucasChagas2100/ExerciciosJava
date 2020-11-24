package ExerciciosHerancaPolimorfismo;

public class Cachorro extends Animal{
	private boolean deveCorrer;

	public Cachorro(String nome, int idade, boolean deveCorrer) {
		super(nome, idade);
		this.deveCorrer = deveCorrer;
	}
	
	public String isDeveCorrer() {
		return "Animal que corre";
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	public String emitirSom() {
		return "au au au au";
	}
	
	

}
