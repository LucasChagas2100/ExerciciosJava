/*Crie uma aplicação em spring, onde através do controller exponha 4 end-points demonstrando 
 * quais habilidades e mentalidades foram usadas com mais destaque para o aprendizado do spring, 
 * Importante: Deverá ser escolhida pelo menos 2 habilidade e 2 mentalidades
 */
package com.generation.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.primeiroprojeto.model.Generation;

@RestController
@RequestMapping("/generation")


public class Controller {
	@GetMapping("/habilidade1")
	public Generation Habilidade1() {
		Generation objeto = new Generation("A primeira habilidade mais usada é a de orientação ao detalhe,"
				+ " pois qualquer vírgula esquecida pode causar problemas na aplicação.", true);
		return objeto;
	}
	
	@GetMapping("/habilidade2")
	public Generation Habilidade2() {
		Generation objeto = new Generation("A segunda habilidade mais usada é a de comunicação, pois está presente"
				+ " não só na fala em si, mas também na escuta, quando se precisa aprender algo novo.", true);
		return objeto;
	}
	
	@GetMapping("/mentalidade1")
	public Generation Mentalidade1() {
		Generation objeto = new Generation("A primeira mentalidade mais usada é a de persistência,"
				+ " já que o assunto é um pouco complicado, contudo, pode ser dominado com muita prática.", true);
		return objeto;
	}
	
	@GetMapping("/mentalidade2")
	public Generation Mentalidade2() {
		Generation objeto = new Generation("A segunda mentalidade mais usada é a de crescimento,"
				+ " uma vez que novos conhecimentos nos proporcionam crescer.", true);
		return objeto;
	}
}
