import java.util.Scanner; //importamos a classe Scanner

public class Break { //ele quebra a execu��o de um ciclo

	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in); // criamos um objeto Scanner
		
		System .out.println("Digite um numero de 0 a 10"); // jogamos uma mensagem na tela do usuario: Digite um numero de 0 a 10.
		int numero = input.nextInt();// utilizando objeto Scanner jogamos na variavel inteira numero o valor que o usuario digitar
		
		for(int i =0;i<=10; ++i) {// variavel inteira i = 0. enquanto i for menor ou igual a 10 sera adicionado 1 na variavel i
			
			if(i==numero) { // a variavel if quer dizer que se i for igual a numero. "numero" � a variavel que o usuario digitou. 
							//Logo se if for igual ao valor da variavel que o usuario digitou ir� aparecer a mensagem abaixo.
				System .out.println("O seu numero �" +" "+ i); //EX: se for digitado numero 5 e i tiver o valor de 5 eu vou ver essa mensagem.
				break; // ele vai parar a execu��o do ciclo quando encontrar o numero que o usuario digitou ou que o usuario estiver procurando
			}else {
			
			System .out.println("O seu numero n�o �" +" "+ i); // toda vez que o i n�o tiver o valor que o usuario digitou
		}
// // na hora em que for achado o numero que o usuario digitou ou estava procurando, logo ap�s dar a mensagem "o seu numero �" logo abaixo escreva a palavra Break... 
		
	}

}
}
