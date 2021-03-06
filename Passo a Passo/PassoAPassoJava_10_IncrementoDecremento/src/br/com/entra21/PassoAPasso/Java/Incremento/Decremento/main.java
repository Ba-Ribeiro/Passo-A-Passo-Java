package br.com.entra21.PassoAPasso.Java.Incremento.Decremento;

public class main {

	public static void main(String[] args) {

		// Incremento e Decremento;
		// S?o operadores especiais que utilizamos para aumentar ou diminuir um valor
		// armazenado em uma variavel em 1 unidade.
		// S?o usados para que o codigo seja mais legivel.

		// Incremento = aumenta o valor da variavel em 1 unidade
		// x++
		// x=10
		// 10 + 1 = 11

		// Decremento = diminui o valor da variavel em 1 unidade
		// x = 20
		// x --
		// 20 - 1 = 19

		// P?s fixo x ++ = x+1
		// x-- = x-1

		// No p?s fixos dentro de uma opera??o que envolva a variavel que sera
		// incrementada (x++ / x--). O valor original da variavel ? tilizado e s? depois
		// ser? realizado o incremento dela

		// Pr? fixo (++x / --x)
		// Nesse caso acontece que a variavel vai ser crementada ou decrementada
		// primeiro e esse valor incrementado ou decrementado ser? utilizado na
		// express?o onde a variavel se encontra.

		// Tem uma diferen?a do incremento e decremento dependendo da posi??o que voc?
		// coloca os operadores.

		// Os operadores s?o utilizados para substituir essas express?es x++ = x= x+1
		// onde x recebe x + 1 e a mesma coisa para x--

		// a++ ? um atalho para adiciona +1 ao valor j? existente na variavel a. logo
		// ficaria 1+10=11

		int a = 10;
		int b = a++;

		System.out.println(a);
		System.out.println(b);

		// P?s
		// o valor original da variavel a ? jogado na variavel b e depois ? feito de 1 na variavel 
		a = 11; // pq foi adicionado 1 na variavel a
		b = 10; // b obteve o valor de a quando a ainda tinha o valor de 10.

		int c = 10;
		int d = ++c;

		System.out.println(c);
		System.out.println(d);

		// Pr?
		// Primeiro ? adicionado 1 no incremento da variavel e ai sim o valor ? jogado na outra variavel e por isso deu 11
	}
}