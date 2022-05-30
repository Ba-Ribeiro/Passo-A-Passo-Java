package br.com.entra21.PassoAPasso.jana.resto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Em Java temos +, -, * , / e o %
		// % = é o operador que permite ter o restante de uma divisão.
		// Sabemos que se o numero for divisor de 2 e não tiver resto ele é Par e se for divisor de 2 e tiver resto ele será Impar. 
		int x = 12 % 5; // temos que pensar em quantas vezes o numero 5 cabe no número 12. Cabe 2 vezes e tem 2 de resto até chegar o 12
		 
		
		// exemplo: Fazer um programa que o usuario digite um valor em Gramas 
		//e temos que passar para o usuario esse valor convertido em Quilos e em Gramas.
		
		Scanner input = new Scanner(System.in); // função para capturar o que o usuario irá digitar
		
		System.out.println("Insira um valor em gramas"); // o que eu quero que o usuario me informe
		int gramas = input.nextInt(); // criei uma variavel gramas do tipo inteira.
									//Que quer dizer que Kilos vai ser igual a gramas dividido por 1000 gramas=Kilos/1000. 
		
		int Kilos = gramas / 1000; // Criar uma variavel Kilos
		gramas = gramas % 1000;    // gramas é igual o que tiver em gramas resultado da divisão por mil. 
								   //Caso a divisão não seja exata quer dizer que possui gramas sobrando para esse valor na variavel gramas.
		
		System.out.println("O total de Kilos é = " + Kilos);
		System.out.println("O total de gramas é =" + gramas);
	 

	}

}
