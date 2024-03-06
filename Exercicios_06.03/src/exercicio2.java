import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		//Variáveis
		double f, c;
		
		//Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		
		//Processamento de dados
		System.out.print("Estão quantos graus? ");
		c = teclado.nextDouble();
		
		f = ((c * 9/5) + 32);
		
		//Saída de dados
		System.out.println("Sua temperatura em Fahrenheit é de =  " + f );

	}

}
