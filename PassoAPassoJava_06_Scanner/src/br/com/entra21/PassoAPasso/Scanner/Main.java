package br.com.entra21.PassoAPasso.Scanner;

import java.util.Scanner; // 2� passo: Quando vc clicar no erro ir� aparecer essa linha.

public class Main {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in); //1� passo:Insira a fun��o  Scanner, ela serve  para capturar os dados que o usuario ir� digitar.
		//ela vai dar um erro, vc clica no erro.
		
	//ex: calcular a area de um retangulo.
		
		double base, altura, areaRetangulo; //3� informar que dado sera capaz de armazenar os valores das variaveis.
		
		System.out.println("informe o valor da base"); //4� jogar uma mensagem para que o usuario informe o que precisa ser digitado. 
		base = input.nextDouble(); //5� para que o valor inserido seja jogado na variavel base � necessario inserior o nome da variavel.input.next o tipo de variavel que ela �.
		
		System.out.println("informe o valor da altura"); //6� fiz a mesma coisa para altura
		altura = input.nextDouble();
		
		areaRetangulo =base*altura; //calcular com os dados que o usuario inserir.
		
		System.out.println("A area de um retangulo de base = " + base + " e altura = " + altura);
		System.out.println(" � " + areaRetangulo);

	}

}
