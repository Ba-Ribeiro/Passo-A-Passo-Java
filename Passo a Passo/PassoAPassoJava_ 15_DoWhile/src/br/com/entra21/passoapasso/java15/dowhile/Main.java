package br.com.entra21.passoapasso.java15.dowhile;

public class Main {

	public static void main(String[] args) {
		
		//do quer dizer faça. Primeiro irá fazer o que estiver entre {} depois controlar se a expressão que estiver
		// entre () for verdadeira
		
		int i = 1; //3° Passo criar uma variavel
		
		do { //1° passo: vamos fazer primeiro o que estiver entre{} depois vamos controlar com o while. O Do While garante 
			// ao menos 1 vez uma execução do ciclo.a 
		
			System.out.println(i);// 5° passo:a cada vez que o ciclo do while for executado, eu quero que o valor da variavel i apareça na tela do usuario
			++i; //6° vamos acrescentar o +1 no valor da variavel i
		} while(i<100); //2° passo: criar o while e uma condição dentro do ().
		// enquanto essa condição 

	}

}
