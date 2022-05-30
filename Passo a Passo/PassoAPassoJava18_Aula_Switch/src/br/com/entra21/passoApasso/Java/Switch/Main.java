package br.com.entra21.passoApasso.Java.Switch;

import java.util.Scanner; // importamos a classe Scanner 

public class Main { // informamos a classe

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // objeto Scanner input

		System.out.println(" Selecione um numero de 1 a 5"); // Uma mensagem para o usuario
		int num = input.nextInt(); // utilizando o objeto Scanner input jogamos na variavel inteira nun o valor que
									// o usuario digitar

		// Switch vai nos permitir fazer um controle e baseado nesse controle executar
		// determinadas instruções

		switch (num) { // Significa trocar. Ele troca de acordo com o caso. Entre () colocar o que você
						// deseja controlar.
						// Logo o usuario digitou um valor para a variavel num e eu quero controlar qual
						// o valor da variavel num
						// Entre os {} terá varios casos para analisar

		case 1: // do ingles significa caso. Esse caso está controlando se o valor da variavel
				// num é igual a um
				// caso o valor da variavel num for 1 irá acontecer o que estiver especificado
				// nas linhas abaixo
			System.out.println(" Você escolheu 1"); // o usuario irá ver essa mensagem caso 1 foro o numero que o
													// usuario digitou
			break; // serva para interromper a função do ciclo.
		case 2:
			System.out.println(" Você escolheu 2");
			break;
		case 3:
			System.out.println(" Você escolheu 3");
			break;
		case 4:
			System.out.println(" Você escolheu 4");
			break;
		case 5:
			System.out.println(" Você escolheu 5");
			break;
		default: // vem do inglês que significa "Padrão" ele será utilizado caso nenhum dos casos
					// acima corresponda
			System.out.println(" Não existe essa opção");
		}

	}

}

