package br.com.entra21.PassoAPasso.Java.Variaveis;

public class Main {

	public static void main(String[] args){
		// Variaveis: � o modo  que a linguagem java consegue lidar com tipos de datas(numeros  inteiros, decimais, caracteries...)
		// 1� Passo: Criar uma variavel;
		// informar que tipo de variavel �: analisar se vai armazenar um numero inteiro, decimais...
		
		// ex 1: 
			
		int x; // declarar a variavel: especificar que tipo de data ela pode armazenar: int, byte... e o nome da variavel ex: x
		x=10;
		
		// ex 2: 
		int y=20; // nome da variavel = y. tipo de data que ela pode armazenar= int.
		
		// ex 3: 
		int soma = x + y; // criar uma variavel = soma. � igual a soma de outras 2
				System.out.println(soma); // quando executar ir� aparecer o resultado no console
				
				int subtracao = x - y; // subtra��o
				System.out.println(subtracao);
				
				int divisao =x / y; // divis�o // na divis�o as casas decimais n�o ir�o aparecer, o n�mero decimal ir� ser ignorado.
				System.out.println(divisao);
				
				int multiplicacao =x * y; // multipli��o
				System.out.println(multiplicacao);
				
		System.out.println("Variavel");
		System.out.println(x); // colocamos a variavel x dentro dos parenteses e quando executar ir� aparecer o numero 20 no console.
		System.out.println("eu tenho" +  x  +  "anos"); //Concatenamos a frase com a variavel. Para isso a frase que vc quer que apare�a no console coloque entre as "" acrescente o sinal de + e informe a sua variavel, caso queira escrever mais inserir o sinal de + e estrever entre"" novamente.

		
	}

}
