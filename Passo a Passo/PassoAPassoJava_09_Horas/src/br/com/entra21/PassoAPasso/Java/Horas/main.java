package br.com.entra21.PassoAPasso.Java.Horas;

public class main {

	public static void main(String[] args) {
	
		
	long totalMilisegundos = System.currentTimeMillis() - 10800000; // É um metodo que retorna a quantidade de mili segundos que foram passadas desde
														 // 00:00, 01/01/1970.
														 // O Valor que será jogado na variavel totalmilisegundos é o numero de milisegundos que já foi passado desde 01/01/1970 as 00:00. 
	long totalSegundos = totalMilisegundos/1000;
	long segundoAtual = totalSegundos % 60;
	
	long totalMinutos = totalSegundos / 60;
	long minutoAtual = totalMinutos % 60; // peguei o total de minutos e dividi por 60 para obter a quantidade de horas, logo eu quero saber a quantidade restante de minutos daquela hora, os minutos atuais.
			
	long totalHora = totalMinutos / 60;
	long horaAtual = totalHora % 24;
	
	System.out.println(horaAtual + "." + minutoAtual + "." + segundoAtual);
	
	}

}
