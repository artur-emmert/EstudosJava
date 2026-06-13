import java.util.Scanner;

public class idade {
public static void main(String[] args) {
    String seuNome;
    int suaIdade;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite seu nome completo: ");
    seuNome = leitor.nextLine();

    System.out.println("Digite sua idade: ");
    suaIdade = leitor.nextInt();

    System.out.println("Seu nome é " + seuNome + " e sua idade é " + suaIdade + ". Seja Bem vindo!");

    leitor.close(); // Boa prática: fechar o scanner
}
}

