package br.com.entra21.passoApasso.Java.Switch;

import java.util.Scanner; // importamos a classe Scanner 

public class Main { // informamos a classe

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // objeto Scanner input

		System.out.println(" Selecione um numero de 1 a 5"); // Uma mensagem para o usuario
		int num = input.nextInt(); // utilizando o objeto Scanner input jogamos na variavel inteira nun o valor que
									// o usuario digitar

		// Switch vai nos permitir fazer um controle e baseado nesse controle executar
		// determinadas instru��es

		switch (num) { // Significa trocar. Ele troca de acordo com o caso. Entre () colocar o que voc�
						// deseja controlar.
						// Logo o usuario digitou um valor para a variavel num e eu quero controlar qual
						// o valor da variavel num
						// Entre os {} ter� varios casos para analisar

		case 1: // do ingles significa caso. Esse caso est� controlando se o valor da variavel
				// num � igual a um
				// caso o valor da variavel num for 1 ir� acontecer o que estiver especificado
				// nas linhas abaixo
			System.out.println(" Voc� escolheu 1"); // o usuario ir� ver essa mensagem caso 1 foro o numero que o
													// usuario digitou
			break; // serva para interromper a fun��o do ciclo.
		case 2:
			System.out.println(" Voc� escolheu 2");
			break;
		case 3:
			System.out.println(" Voc� escolheu 3");
			break;
		case 4:
			System.out.println(" Voc� escolheu 4");
			break;
		case 5:
			System.out.println(" Voc� escolheu 5");
			break;
		default: // vem do ingl�s que significa "Padr�o" ele ser� utilizado caso nenhum dos casos
					// acima corresponda
			System.out.println(" N�o existe essa op��o");
		}

	}

}

