import java.util.Scanner;

public class Continue {

			public static void main(String[] args) {
			 
				Scanner input = new Scanner(System.in); // criamos um objeto Scanner
				
				System .out.println("Digite um numero de 0 a 10"); // jogamos uma mensagem na tela do usuario: Digite um numero de 0 a 10.
				int numero = input.nextInt();// utilizando objeto Scanner jogamos na variavel inteira numero o valor que o usuario digitar
				
				for(int i =0;i<=10; ++i) {// variavel inteira i = 0. enquanto i for menor ou igual a 10 sera adicionado 1 na variavel i
					
					if(i==numero) { // a variavel if quer dizer que se i for igual a numero. "numero" � a variavel que o usuario digitou. 
									//Logo se if for igual ao valor da variavel que o usuario digitou ir� aparecer a mensagem abaixo.
						System .out.println("O seu numero �" +" "+ i); //EX: se for digitado numero 5 e i tiver o valor de 5 eu vou ver essa mensagem.
				
					}else {
					
					System .out.println("O seu numero n�o �" +" "+ i); // toda vez que o i n�o tiver o valor que o usuario digitou
				}continue; // toda vez que i n�o corresponder ao numero que o usuario digitou vai aparecer a mensagem que estiver no 
				//SYSO e ir� ignorar o que estiver de informa��o para baixo e vai iniciar o ciclo novamente
		//Continue:� o opsto de Break. A medica que o Break quebra o ciclo for o continue pula uma determinada execu��o.
				}
				System .out.println("kkkkkkkkkk"); // A cada vez que o ciclo � executado ele vem com essa mensagem complementando 
				
				
			}

		}