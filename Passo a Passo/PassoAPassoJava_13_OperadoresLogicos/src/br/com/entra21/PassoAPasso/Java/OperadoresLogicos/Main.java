package br.com.entra21.PassoAPasso.Java.OperadoresLogicos;

import java.util.Scanner;

public class Main { //Oerador Logico != , && e ||.  Criar um programa que ir� nos avisar se o n�mero � um n�mero par ou um n�mero impar

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Objeto Scanner 
		System.out.println("Insira um n�mero inteiro");//vou pedir que o usuario forne�a o n�mero
		int numero=input.nextInt();   // vou criar uma variavel inteira que vai se igual ao objeto input
				
				if(numero%2==0) {// se o resultado da divis�o por 2 for igual a zero quer dizer que o n�mero � PAR.
					
					System.out.println("PAR");
					
					
				
				}
if(numero%2!=0) {// != quer dizer diferente de.  Se o resultado da divis�o por 2 for diferente de Zero quer dizer que o n�mero � IMPAR.
					
					System.out.println("IMPAR");
	}
//ANALISAR SE O NUMERO � PAR && SE O NUMERO FOR MAIOR QUE 20.
if((numero%2==0) && (numero<20)) {// analisar primeiro se o numer � PAR e se o numero � maior que 10
	
	System.out.println("Ok");
}
if((numero % 2 == 0)||(numero<20)) { // || = OU

	}
}
}