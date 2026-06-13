import java.util.Scanner;

public class tresnotas {
public static void main(String[] args) {
double nota1;
double nota2;
double nota3;

   Scanner leitor = new Scanner(System.in);

    System.out.println("digite a sua primeira nota: ");
    nota1 = leitor.nextDouble();

    System.out.println("digite a sua segunda nota: ");
    nota2 = leitor.nextDouble();

    System.out.println("digite a sua terceira nota: ");
    nota3 = leitor.nextDouble();

    double media = (nota1 + nota2 + nota3 ) / 3;

	System.out.println("A sua média é: " + media );

	leitor.close();

}
}

