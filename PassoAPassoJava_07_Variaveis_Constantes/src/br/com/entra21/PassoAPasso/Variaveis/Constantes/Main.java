package br.com.entra21.PassoAPasso.Variaveis.Constantes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variavel Constante: não podemos alterar o valor dessa variavel depois que foi atribuido um valor.
		
		int x = 10; // para fazer com que a variante seja constante, coloca a palavra final na frente
					// Exemplo: final int x = 10;
		
		// exercicio
		
		final double PI =3.1456;
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o valor do raio");
		double raio = input.nextDouble();
		
		double area = raio*raio*PI;
				
				System.out.println("O valor da area é =" + area);
				
	}

}
