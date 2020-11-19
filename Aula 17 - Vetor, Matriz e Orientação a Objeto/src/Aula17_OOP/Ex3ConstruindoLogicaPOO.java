/*Descreva em no máximo 200 palavras o que é um automóvel, uma pessoa e uma casa e o que eles fazem. 
 * Liste os substantivos e verbos separadamente. 
 * 
 * Cada substantivo corresponde a um objeto que precisará ser construído para implementar um sistema, nesse caso, um carro. 
 * Selecione 5 dos objetos que você listou e, para cada um, liste vários atributos e comportamentos. 
 * 
 * Descreva brevemente como esses objetos interagem entre si e com outros objetos na sua descrição. 
 * Estes passos que você seguiu são típicos do projeto orientado a objetos.
 */
package Aula17_OOP;

public class Ex3ConstruindoLogicaPOO {
	public static void main(String[] args) {
		String significadoCarro= "O carro(substantivo) é um meio de transporte motorizado com rodas comumente usados em estradas, "
				+ "com capacidade de transportar de 1 a 8 pessoas.";
		String atributosCarro = "Estados: ligado, estacionado, cor, placa, marca, modelo, potência";
		String metodosCarro= "Verbos: acelerar, freiar, virar, trocar marcha";
		
		String significadoPessoa = "indivíduo considerado por si mesmo; ser humano, criatura";
		String atributosPessoa = "Estados: línguagem, peso, cor, estado-civil ";
		String metodosPessoa = "Engordar, emagrecer, aprender, ensinar";
		
		String significadoCasa= "Edíficio geralmente utilizado para habitação, podendo ter vários tamanhos e formas";
		String atributosCasa= "Estados: alugada, quantidade de cômodos, andares, cor, ";
		String metodosCasa= "Verbos: alugar, reformar, construir, pintar, vender, morar";
		
		String objetoEstacionado = "Atributos: marcha neutra, volantes retos, freio de mão acionado"
				+ "Comportamentos: Parar, puxar freio de mão, virar volante, mudar a marcha";
		String objetoCor = "Atributos: cor única, colorido, desgastado "
				+ "Comportamentos: pintar, polir, restaurar";
		String objetoLigado = "Atributos: chave acionada, marcha neutra, painel ativado"
				+ "Comportamentos: girar chave, passar marcha, acender painel";
		String objetoPotencia = "Atributos: limites de velocidade, capacidade de arrancada, tempo de resposta "
				+ "Comportamentos: forte aumento de velocidade, freiar bruscamente, girar volante facilmente";
		String objetoPlaca = "Atributos: identificação, localidade, validade"
				+ "Comportamentos: vence o prazo de renovação, desgasta, danifica";
		
		String interacao = "A interação está bem presente nos elementos citados, a potência do carro, por exemplo, está "
				+ "fortemente ligada ao modelo deste carro. Cada modelo pode apresentar suas características, alguns modelos "
				+ "possuem determinadas cores ou tamanhos.";
				
	}

}
