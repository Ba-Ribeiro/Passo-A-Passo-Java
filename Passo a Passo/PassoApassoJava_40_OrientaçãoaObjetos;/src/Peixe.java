
public class Peixe {

	public static void main(String[] args) {
		// Orientado a Objetos veio para tentar aproximar o mundo real, os objetos que existem ao nosso redor para programa��o
		// Para facilitar a cria��o e manter um programa.
		//em programa��o da pra encaixar praticamente tudo como sendo objeto;
		// ex: pode dizer que o telefone tem as seguintes caracteristicas: tem peso, tamanho da tela em polegadas, tem um fabricante e 
		//tem algumas a��es: tira foto, navega na internet, assisti videos, escuta musica,
		// logo um objeto existe 2 coisas: 1� seria os atributos: peso, altura, fabricante. 
		//E existe alguns comportamentos ou a��es: que seria o que podemos fazer com aqueles objetos
	}
//1� Passo Nomear a classe com o nome do objeto
//2� Passo pensar o que seriam os atributos de um peixe na vida real: ela tem uma especie, tem tamanho,habitati.
	String Especie = "Salm�o";
	int Peso = 30;
	float Tamanho = 0.80f;
	String Alimentacao = "Camar�o";
	
	public void peso() {
		if(Peso<=30) {
			System.out.println(" Salm�o est� abaixo do peso ");
		}else(Peso + ">=45"){
		System.out.println("Salm�o est� acima do peso");
		}
		
	}
}
