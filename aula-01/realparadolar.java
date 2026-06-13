import java.util.Scanner;

public class realparadolar
{
public static void main(String[] args) {
        double real;
    double dolar;

    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um valor em reais: ");
    real = leitor.nextDouble();


    dolar = real * 5 ;

	System.out.println("O valor de real e dolar é: +" + dolar);

	leitor.close();

}
}

