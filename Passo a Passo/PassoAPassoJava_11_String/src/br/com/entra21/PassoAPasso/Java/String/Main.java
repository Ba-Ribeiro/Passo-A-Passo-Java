package br.com.entra21.PassoAPasso.Java.String;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// String é uma variavel especial de Java que nos permite armazenar um conjunto de caracteries
	Scanner input = new Scanner(System.in); // Vai permitir capturar o que o usuario digitar.  
	System.out.println("Qual seu primeiro nome?"); // Pedir para que o usuario informe seu primeiro nome.
	String Primeironome = input.next(); // responsavel por pegar um conjunto de caracteries que o usuario digitar no teclado e jogar na variavel primeiroNome.
	System.out.println("Qual o seu ultimo nome?"); // Pedir para que o usuario informe seu primeiro nome.
	String ultimoNome=input.next();
	System.out.println("Qual a sua idade?"); // Pedir para que o usuario informe a sua idade.
	int idade =input.nextInt();
	System.out.println("Olá" +" " + Primeironome + " " + ultimoNome + " " + "de" + " " + idade + " " + "anos");
	String nome = ("Bárbara"); //1° Passo Criar um objeto tipo String que nos permite armazenar um conjunto de caracteries
	
	System.out.println(nome);
	}

}
