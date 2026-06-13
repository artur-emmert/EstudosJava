/* 3 - Proponha um programa em Java que lê uma variável n, inteira e maior que zero, que representa o número de linhas da figura que segue o padrão a seguir:

n= 5

*****

****

***

**

*      */

import java.util.Scanner;

public class tres
{
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int n; 
        
        System.out.println("Digite um número maior que 0: ");
        n = leitor.nextInt();
        
        if (n <= 0) {
            System.out.println("Valor não é maior que 0");
        }
        else {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        leitor.close();
    }
}