package br.com.entra21.passoapasso.java13.While;

public class main {

	public static void main(String[] args) {
		// while = Lupin, Ciclo, l=La?o, Repeti??o
		// // Escrever While que quer dizer enquanto o que estiver entre () for verdadeira. Ser? executado o que estiver entre {}.

		
		int i = 1; // criar uma variavel 
		while(i<101){ //precisa criar uma condi??o. Enquanto i for menor que 101 eu quero que o que estiver entre os {} sej? executado
			System.out.println(i);
			
			// se eu executar vai virar um lupin infinito pq, enquanto i for menor que 101 da um print no valor de 1,
			//a cada vez que esse ciclo ? executado ele continua tendo o valor de 1.
			//logo essa condi?ao nunca ser? falsa nunca termina.
			
			++i;  // vou adicio 1 na variavel i ou seja cada vez que esse ciclo for executado eu 
			      //incremento a minha variavel i em 1 de tal modo que eventualmente essa condi??o 
				 //n?o ser? mais verdadeira
		}
		

		
	}

}
