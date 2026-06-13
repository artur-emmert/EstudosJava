//4.Peça duas medidas e calcule a area do retangulo;

import java.util.Scanner;

public class arearetangulo
{
public static void main(String[] args) {
        double aresta1;
    double aresta2;
    double areaRetangulo;

    Scanner leitor = new Scanner(System.in);
    System.out.println("Qual o valor de primeira aresta do retangulo? ");
    aresta1 = leitor.nextDouble();

    System.out.println("Qual o valor de segunda aresta do retangulo? ");
    aresta2 = leitor.nextDouble();

    areaRetangulo = aresta1 * aresta2;

	System.out.println("A area do retangulo é: " + areaRetangulo);

	leitor.close();
}
}