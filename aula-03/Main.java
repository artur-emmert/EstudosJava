/*1 - Proponha um programa em Java que lê uma variável n, inteira e maior que zero, que representa o número de linhas da figura que segue o padrão a seguir:

n = 5

*****

*****

*****

*****

*****     */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
				int n;
				
        System.out.println("Digite um número inteiro maior que zero para 'n': ");

        n = scanner.nextInt();

        // Verifica se 'n' é maior que zero

        if (n <= 0) {

            System.out.println("Número inválido. 'n' deve ser maior que zero.");

        } else {

            // Imprime a figura

            for (int i = 0; i < n; i++) {

                System.out.println("*****");

            }

        }

    }

}
