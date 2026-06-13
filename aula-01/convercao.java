/*3. Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
 Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.*/

import java.util.Scanner;

public class convercao {
	public static void main(String[] args) {
	    
	    double temperaturaCelcius;
	    double temperaturaFareheit;
	    
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.println("Qual a temperatura na sua localização agora e graus celcius ? ");
	    temperaturaCelcius = leitor.nextDouble();
	    
	    temperaturaFareheit = (temperaturaCelcius * 1.8) + 32;
	    
		System.out.println("A sua temperatua em Farenheit é igual a " + temperaturaFareheit );
		
		leitor.close();
		
	}
}
