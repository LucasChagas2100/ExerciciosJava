package ExerciciosHerancaPolimorfismo;

public class Preguica extends Animal{
	private boolean deveSubirArvores;

	public Preguica(String nome, int idade, boolean deveSubirArvores) {
		super(nome, idade);
		this.deveSubirArvores = deveSubirArvores;
	}

	public String isDeveSubirArvores() {
		return "Animal que sobe em árvores";
	}

	public void setDeveSubirArvores(boolean deveSubirArvores) {
		this.deveSubirArvores = deveSubirArvores;
	}
	
	public String emitirSom() {
		return "Iiiiiih";
	}
	

}
