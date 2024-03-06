import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Variáveis
		double base, altura, area, perimetro;
		
		//Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		
		//Processamento de dados
		System.out.print("Qual a base ");
		base = teclado.nextDouble();
		
		System.out.print("Qual a altura ");
		altura = teclado.nextDouble();
		
		area = base * altura;
		
		perimetro = (base*2)+(altura*2);
		
		
		//Saída de dados
		System.out.println("A sua área é =  " + area );
		System.out.println("O seu perímetro é =  " + perimetro );
		

	}

}
