/*somente regras:
- "+" (adição)
- "-" (subtração)
- "*" (multiplicação)
- "/" (divisão)
- "%" (resto da divisão)
- ==" (igual a)
- "!=" (diferente de)
- ">" (maior que)
- ">=" (maior ou igual a)
- "<" (menor que)
- "<=" (menor ou igual a)
 */

// casting - converter um dado em outro
// int x = 10;
// double y = x; // casting implícito

// double x = 10.5;
// int y = (int) x; // casting explícito

/*exercícios
1. Escreva um programa que leia 2 numeros e exiba a soma deles: */
import java.util.Scanner;

public class App{ public static void main(String[] args) {
        int numero1;
    int numero2;

    Scanner leitor = new Scanner(System.in);

	System.out.println("Diga um numero");
	numero1 = leitor.nextInt();

	System.out.println("Diga outro numero");
	numero2 = leitor.nextInt();

	int soma = numero1 + numero2;


	System.out.println("o resultado dessa some é " + soma);

}
}
