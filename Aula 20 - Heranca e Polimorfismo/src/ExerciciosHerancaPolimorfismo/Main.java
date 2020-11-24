package ExerciciosHerancaPolimorfismo;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Animal> conjunto1 = new HashSet<Animal>();
		
		Cachorro rex = new Cachorro("Rex", 1, true);
		Cavalo urano = new Cavalo("Urano",5, true);
		Preguica flash = new Preguica("Flash", 8, true);
		
		conjunto1.add(rex);
		conjunto1.add(urano);
		conjunto1.add(flash);
		
		for( Animal cada: conjunto1) {
			System.out.println(cada.toString()+ " Emite o som: "+ cada.emitirSom());
		}
		//Animal[] pets = new Animal[3];
		
		
	}

}
