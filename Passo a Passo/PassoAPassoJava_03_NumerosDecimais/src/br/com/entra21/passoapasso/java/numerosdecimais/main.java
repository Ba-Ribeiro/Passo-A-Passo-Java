package br.com.entra21.passoapasso.java.numerosdecimais;

public class main {

	public static void main(String[] args) {
	
	int x = 150;
	double y = 10.5; // a variavel double vai permitir adicionar variaveis decimais e /tem uma precis�o maior 
	double resultado = x / y; // quando for divis�o as casas decimais ir�o aparecer.
	
	int a = 150;
	float b = 10.5f; // a variavel float vai permitir adicionar variaveis decimais, logo precisa acrescentar a letra f ap�s o numero. /tem uma precis�o menor no resultado 
	float resposta = a / b;
			System.out.println(resultado);
			System.out.println(resposta);
			

	}

}
