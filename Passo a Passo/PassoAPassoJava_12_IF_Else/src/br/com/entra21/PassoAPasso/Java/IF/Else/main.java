package br.com.entra21.PassoAPasso.Java.IF.Else;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// If Else : Quer dizer que se alguma coisa fazer isso, caso contrario fazer outra coisa 
		// If = Se
		//Else = Caso contrario
		
		// O objetivo ?: vamos perguntar o nome do usuario, a idade do usuario. 
		// Na idade devemos mostrar uma mensagem para o usuario  se ele for menor de 18  ir? exibir a mensagem: ele ? menor de idade
		// Se tivier 18 ou mais aparecera a mensagem de: maior de idade
		// 1? Passo: se vamos obter informa??o do usuario  n?s vamos precisar do nosso objeto Scanner
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Qual o seu nome?"); //2? Passo: mostrar uma mensagem para o usuario
			String nome=input.nextLine(); //3? Passo: Criar uma String pra armazenar o nome do usuario
			
			System.out.println("Qual a sua idade?"); // 4? Passo: criar uma outra mensagem				
			int idade =input.nextInt(); //5? Passo: como idade vai ser uma variavel do tipo inteira vou criar uma variavel do tipo inteira que eu vou chamar de idade.
			
			// If Else : Quer dizer que se alguma coisa fazer isso, caso contrario fazer outra coisa 
			// If = Se
			//Else = Caso contrario 
		
			if(idade<1){ // Se o usuario informar um numero negativo ir? aparecer a informa??o abaixo. 
				System.out.println("idade informada n?o ? valida");//logo quer dizer que se idade for menor que 1 vai fazer o que estiver entre {}			if(idade<1) { // 6? Passo: Colocar no codigo. Entre () precisa especificar uma condi??o
				  // para uma compara??o eu preciso colocar 2 sinais de iguais: if(idade==18)
			} else(idade + "<18") { //Else: quer dizer caso contrario, se n?o for verdade 
				System.out.println(nome + " ? menor de idade");
	
	} else if(idade>18) { // serve para fazer uma compara??o logo em seguida. Caso contrario se for menor de 18 
		System.out.println(nome + "? maior de idade"); // ir? aparecer essa mensagem.
	}else { // Esse ultimo else ira fechar que quer dizer caso contrario 
		System.out.println(nome + "? maior de idade");
	}
	}

}
