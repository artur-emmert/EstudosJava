import java.util.Scanner;
public class mediaponderada {
    
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

    double nota1;
    double peso1; // * 2

    double nota2;
    double peso2; // * 2

    double nota3;
    double peso3; // * 6

    double mediaPonderada; // media ponderada final

    System.out.println("Qual foi sua primeira nota? ");
    nota1 = leitor.nextDouble();

    System.out.println("Qual foi sua segunda nota? ");
    nota2 = leitor.nextDouble();

    System.out.println("Qual foi sua terceira nota? ");
    nota3 = leitor.nextDouble();

    peso1 = nota1 * 2;
    peso2 = nota2 * 2;
    peso3 = nota3 * 6;

    mediaPonderada = (peso1 + peso2 + peso3) / 100;

		System.out.println("A sua media ponderada final é: " + mediaPonderada);

		leitor.close();
}
}

