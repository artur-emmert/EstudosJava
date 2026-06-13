/* Elabore um algoritmo em Java que, uma vez que o usuário informe a 
idade em anos de um atleta, o programa o classifique em uma das 
categorias a seguir dos jogos da primavera:

Infantil A = 6 a 8 anos

Infantil B = 9 a 12 anos

Juvenil A = 13 a 14 anos

Juvenil B = 15 a 18 anos

Pessoas com menos de 6 anos ou maiores de 18 anos não podem participar da competição. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int idade;
        
        System.out.println("Informe sua idade: ");
        idade = leitor.nextInt();

        if (idade < 6 || idade > 18) {
            System.out.println("Sua idade não é compatível com a competição");
        }
        
        if (idade >= 6 && idade <= 8) {
            System.out.println("Você esta na categoria infantil A");
        }
        
        if (idade >= 9 && idade <= 12) {
            System.out.println("Você esta na categoria infantil B");
        }
        
        if (idade >= 13 && idade <= 14) {
            System.out.println("Você esta na categoria juvemil A");
        }
        
        if (idade >= 15 && idade < 18) {
            System.out.println("Você esta na categoria juvenil B");
        }
    
       leitor.close();
    }
}