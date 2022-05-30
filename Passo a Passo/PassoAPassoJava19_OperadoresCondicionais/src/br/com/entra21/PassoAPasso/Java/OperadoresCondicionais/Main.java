package br.com.entra21.PassoAPasso.Java.OperadoresCondicionais;

public class Main {

	public static void main(String[] args) {
		
		//condição? Caso verdadeiro : caso falso
		
		int a = 10;
		int b = 20;
		int maior;
		
		maior = (a < b)? 500 : 1000; //() o que estiver dentro do () é a sua condição que será avaliado como verdadeiro ou falso
				//caso o que estiver entre () for VERDADEIRO irá retornar para a variavel maior 500.
				// caso o que estiver dentro do () seja FALSO irá retornar 1000.
		
		System.out.println(maior);
	}
	
	

}
