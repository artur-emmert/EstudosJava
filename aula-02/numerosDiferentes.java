import java.util.Scanner;

public class numerosDiferentes {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Informe o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Informe o segundo número diferente: ");
        n2 = leitor.nextInt();
        
        System.out.println("Informe outro número diferente: ");
        n3 = leitor.nextInt();
        
        int soma = n1 + n2 + n3;
        int produto = n1 * n2 * n3;
        
        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        
        System.out.println("a soma é: " + soma);
        System.out.println("o produto é: " + produto);
        System.out.println("maior numero é: " + maior);
        System.out.println("menor numero é: " + menor);
        
        leitor.close();
    }
}