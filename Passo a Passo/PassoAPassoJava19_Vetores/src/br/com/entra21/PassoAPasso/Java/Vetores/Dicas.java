package br.com.entra21.PassoAPasso.Java.Vetores;

public class Dicas {

	public static void main(String[] args) {

		int i; //
		int[] x = new int[5]; // temos um vetor chamado x que pode armazenar valores inteiros de tamanho 5 ou
								// sej? pode armazenar at? 5 valores inteiros

		for (i = 0; i < 5; ++i) { // atraves de um ciclo for n?s percorremos cada membro desse vetor pra jogar na
									// tela desse usuario
									// da um print no valor de cada vetor
			System.out.println(x[i]);
			
			//Primeira Propriedade

			// Qual o valor que da pra ver na tela se for executado esse programa nesse
			// exato momento
			// existe um valor padr?o que a linguagem JAVA automaticamente atribui a
			// variaveis de uma classe ou a membros de um vetor
			// e no caso de um vetor que pode armazenar valores inteiros esse valor ? zero.
			// Logo se n?o for especificado qual que ? o valor de um membro do vetor java
			// automaticamente a linguagem joga o numero 0.
			// Se o vetor for: long, short, byte, flot, doable e n?o for especificado qual ?
			// o valor de um membro do vetor. O valor padr?o seria 0
			// Se o vetor for do tipo char e n?o for especificado qual ? o valor de um
			// membro do vetor. O valor padr?o seria um caracter nulo.
			// Se o vetor for do tipo booleam e n?o for especificado qual ? o valor de um
			// membro do vetor. O valor padr?o seria seria falso.
			// Se o vetor for do tipo String um vetor de objetos seria um ponteiro nulo .

		}
		
		// Segunda Propriedade
		int a;
		int[] y = new  int[3]; //o vetor tem tamanho 3, pode armazenar 3 valores de 0 a 2  
		
		for(a = 0; a <y.length;++a) { // existe um modo que chama o vetor especificando o tamanho dele ao invez de ter que informar um n?mero, 
							  // a.length = ? uma propriedade de vetores na linguagem JAVA. Se na hora de escrever colocar um vetor + . e+ escrever a palavra length
							  // length significa comprimento voc? vai obter quanto em membros o seu vetor pode armazenar. Logo sabemos que o vetor pode armazenar 3
								// Quer dizer que chamando a.length ? como que 3 estivesse sido jogado ali, pq essa propriedade busca a quantidade de membros que o vetor pode armazenar.
							// quer dizer que um determinado ponto na execu??o do ciclo For a variavel vai atingir o valor 4
							//
			System.out.println(y[4]);
		}
		//Terceira Propriedade
		
		java.util.Arrays.fill(x,20);//dentro do () precisa informar o vetor e depois informo o valor que eu quero jogar no vetor x
		// fill, significa encher 
		// ? um metodo da linguagem Java j? definido que nos permite especificar um valor que eu quero jogar em Vetor/Arrays
		

		
		java.util.Arrays.fill(x,2,5,3);// informa o vetor = x; informa o endere?o do primeiro membro que vc quer come?ar a alterar, depois informo at? onde,
		   //qual o intervalo que vc quer jogar onde vai ser o limite. por ultimo informo o valor
	}

	
	
}










