package br.com.entra21.PassoAPasso.Java.Vetores;

public class VetoresMultidimensionais {

	public static void main(String[] args) {
		//Vetores nos permite armaazenar tipos de dados do mesmo tipo, varios tipos de cados, sendo capaz de especificar o tamanho do vetor em um unico membro
		
		//Exemplo
		//O que aconteceria se tivesse um vetor que apenas armazenasse um unico valor, ou um unico objeto, unico caracterie, tivessemos um vetor de um outro vetor 

		// Para fazer um unico vetor, simples
		
		double[]x=new double[5]; //especificar o tipo de data que o vetor vai armazenar colocaria [] que indica que est� fazendo um vetor daria um nome x,
							     //= new double e colocaria entre [] especifica o tamanho.
	

	
	//Exemplo de vetor de vetor:
	
	double [][] y = new double[3][3]; 
	
	// para aCessar cada membro do vetor
	
	y[0][0] = 10;
	y[0][1] = 20;
	y[0][2] = 30;
	y[1][0] = 40;
	y[1][1] = 50;
	y[1][2] = 60;
	y[2][0] = 70;
	y[2][1] = 80;
	y[2][2] = 90;

	
	// para visualixar como pode alterar e como pode obter ler dados da matriz 
	// vai ser preciso 2 ciclos, 1 que acessa o vetor principal e outro que acessa o vetor de vetor 
	
	for(int i =0; i<y.length; ++i) {// variavel i que inicia com o valor de 0, 
									//depois limita a condi��o do ciclo for ao tamanho do vetor e a cada execu��o do ciclo
									//aumento 1 a variavel i.
		
	for (int j = 0; j<y[i].length;++j); { // vamos criar uma outra variavel j. Enquanto j for menor que vetor j na posi��o i. length onde buscou o tamanhode x88
	System.out.print(i+"|" +  + "="+ y[i][j] +"\t");
	}

	}
	}
}