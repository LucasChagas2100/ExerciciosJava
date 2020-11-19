/*Descreva em no m�ximo 200 palavras o que � um autom�vel, uma pessoa e uma casa e o que eles fazem. 
 * Liste os substantivos e verbos separadamente. 
 * 
 * Cada substantivo corresponde a um objeto que precisar� ser constru�do para implementar um sistema, nesse caso, um carro. 
 * Selecione 5 dos objetos que voc� listou e, para cada um, liste v�rios atributos e comportamentos. 
 * 
 * Descreva brevemente como esses objetos interagem entre si e com outros objetos na sua descri��o. 
 * Estes passos que voc� seguiu s�o t�picos do projeto orientado a objetos.
 */
package Aula17_OOP;

public class Ex3ConstruindoLogicaPOO {
	public static void main(String[] args) {
		String significadoCarro= "O carro(substantivo) � um meio de transporte motorizado com rodas comumente usados em estradas, "
				+ "com capacidade de transportar de 1 a 8 pessoas.";
		String atributosCarro = "Estados: ligado, estacionado, cor, placa, marca, modelo, pot�ncia";
		String metodosCarro= "Verbos: acelerar, freiar, virar, trocar marcha";
		
		String significadoPessoa = "indiv�duo considerado por si mesmo; ser humano, criatura";
		String atributosPessoa = "Estados: l�nguagem, peso, cor, estado-civil ";
		String metodosPessoa = "Engordar, emagrecer, aprender, ensinar";
		
		String significadoCasa= "Ed�ficio geralmente utilizado para habita��o, podendo ter v�rios tamanhos e formas";
		String atributosCasa= "Estados: alugada, quantidade de c�modos, andares, cor, ";
		String metodosCasa= "Verbos: alugar, reformar, construir, pintar, vender, morar";
		
		String objetoEstacionado = "Atributos: marcha neutra, volantes retos, freio de m�o acionado"
				+ "Comportamentos: Parar, puxar freio de m�o, virar volante, mudar a marcha";
		String objetoCor = "Atributos: cor �nica, colorido, desgastado "
				+ "Comportamentos: pintar, polir, restaurar";
		String objetoLigado = "Atributos: chave acionada, marcha neutra, painel ativado"
				+ "Comportamentos: girar chave, passar marcha, acender painel";
		String objetoPotencia = "Atributos: limites de velocidade, capacidade de arrancada, tempo de resposta "
				+ "Comportamentos: forte aumento de velocidade, freiar bruscamente, girar volante facilmente";
		String objetoPlaca = "Atributos: identifica��o, localidade, validade"
				+ "Comportamentos: vence o prazo de renova��o, desgasta, danifica";
		
		String interacao = "A intera��o est� bem presente nos elementos citados, a pot�ncia do carro, por exemplo, est� "
				+ "fortemente ligada ao modelo deste carro. Cada modelo pode apresentar suas caracter�sticas, alguns modelos "
				+ "possuem determinadas cores ou tamanhos.";
				
	}

}
