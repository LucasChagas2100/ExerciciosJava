package ExerciciosHerancaPolimorfismo;

public class Cavalo extends Animal{
	private boolean deveCorrer;

	public Cavalo(String nome, int idade, boolean deveCorrer) {
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
		return "hinn in in";
	}
	

}
