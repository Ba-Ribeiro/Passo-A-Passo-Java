package br.com.entra21.PassoAPasso.Java.Vetores;

public class Main {

	public static void main(String[] args) {
		// Vamos criar um programa capaz de armazenar notas de um determinado numero de
		// alunos
		// Se 50 alunos e precisamos armazenar as notas desses alunos e
		// verificar quem est� a cima e quem est� abaixo da m�dia

		// criar um unico membro que consegue armazenar diversos valores decimais;

		int numAlunos = 5; //2�Passo: quando for criar um vetor � possivel especificar manualmente o tamanho do seu
							// vetor escrevendo o numero dentro do segundo [].
							// ou podemos chamar uma outra variavel para especificar o tamanho do vetor.

		double[] notaAlunos = new double[numAlunos]; 
		// 1� Passo informar que tipo de dado que esse vetor vai ser capaz
		// de armazenar
		// dado+[]+informar o nome do vetor = new double e [] dentro desse chaves
		// especificar o tamanho do vetor.
		// esse tamanho simboliza quantos membros do tipo double eu consigo armazenar,
		// logo conseguiria armazenar at� 50 notas
		
		//3� Passo: Informar os valores dos membros do vetor
		//Em um vetor com 5 posi��es temos 5 indices que iniciam a contagem no zero
		
		notaAlunos[0] = 6.7;
		notaAlunos[1] = 5.7;
		notaAlunos[2] = 7.8;
		notaAlunos[3] = 6.7;
		notaAlunos[4] = 9.3;
	}
}
