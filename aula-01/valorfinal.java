import java.util.Scanner;
public class valorfinal
{
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    double C; // capital incial
    double i; // taxa de juros
    double t; // tempo em meses
    double V; // valor final

    System.out.println("--- Calculadora de Investimento (Juros Simples) ---");

    System.out.print("Digite o capital inicial (C): ");
    C = leitor.nextDouble();

    System.out.print("Digite a taxa de juros decimal (i) (ex: 0.10 para 10%): ");
    i = leitor.nextDouble();

    System.out.print("Digite o tempo do investimento (t): ");
    t = leitor.nextDouble();

    V = C * (1 + i * t);

    System.out.printf("O valor final (V) após o período é: R$ %.2f%n", V);

    leitor.close();


	System.out.println("Hello World");
}
}