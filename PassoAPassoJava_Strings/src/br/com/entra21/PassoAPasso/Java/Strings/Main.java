package br.com.entra21.PassoAPasso.Java.Strings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// como lidar com frases ou conjunto de caracteres na linguagem JAVA
		// APRENDEMOS SOBRE OS DADOS PRIMITIVOS, LOGO NENHUM DEsses TEM A CAPACIDADE DE
		// ARMAZENAR UM NOME. PARA ISSO:

		Scanner input = new Scanner(System.in); // criamos o objeto Scanner, ele que vai permitir que seja feita a captura do nome
												// do usuario.

		System.out.println("Qual seu primeiro nome");
		String PrimeiroNome = input.next();// ele é responsavel por pegar um conjnto de caracteries do usuario e jogar na variavel primeironome. 

		System.out.println("Qual seu ultimo nome");
		String UltimoNome = input.next();

		System.out.println("Qual a sua idade?");
		int idade = input.nextInt();

		System.out.println("Olá" + PrimeiroNome + " " + UltimoNome + " de " + idade + " anos");

		// COMANDO PARA PEDIR QUE O USUARIO INFORME O NOME DELE.
	}

}
