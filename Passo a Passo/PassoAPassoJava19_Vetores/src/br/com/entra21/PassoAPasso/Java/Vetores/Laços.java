package br.com.entra21.PassoAPasso.Java.Vetores;

import java.util.Scanner;

public class La�os {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // permite que o usuario forne�a as notas dos alunos

		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];

		for (int i = 0; i < numAlunos; ++i) { // criei uma variavel i que � = 0.
												// enquanto i for menor que numAlunos que � = 5, vai ser acrescentado +1 na
												// variavel
			
			System.out.println("Insira a nota do" +" "+ (i + 1) +" "+ "aluno."); // a mensagem que aparecera para o usuario
			
			notaAlunos[i] = input.nextDouble(); // quero armazenar o valor que o usuario digitar na primeira posi��o do
												// vetor nota alunos,
												// lembrando que a primeira posi��o � 0
			// Atravez de um ciclo for � permitido que o usuario insira a nota dos alunos
			// at� o final do vetor
		}// i+1 pq na primeira execu��o do ciclo a variavel i tem o valor inicial de 0 por isso foi adicionado 1 no valor da variavel i.
		
		// Como ler/dar um print nos valores de um vetor
		for (int i = 0; i < numAlunos; ++i) { // exemplo de como acessar cada membro acessando atraves do ciclo For.
	
		System.out.println("->" + notaAlunos[i]); // esse ciclo sera executado baseado na quantidade de alunos e a cada vez que o ciclo for executado
												 // vai ser dado um print no valor que estiver armazenado no vetor notaAluno na posi��o i
		}		// como i faz parte do ciclo quer dizer que a cada vez que o ciclo for executado vou estar lendo 1 membro do vetor
		

}
}