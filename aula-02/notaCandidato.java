// 4 - Proponha um algoritmo em Java para calcular a nota de um candidato em um concurso. Para isso, 
// você deve ler as três notas do candidato entre 0 e 10. Em seguida, calcule a nota final dele no concurso,
//  a qual corresponde à média ponderada, considerando que a primeira nota tem peso 2, a segunda tem peso 3 e a 
//  terceira tem peso 5. Exibir uma mensagem dizendo qual a média do aluno e se ele foi aprovado ou reprovado. 
//  A média para aprovação é 7.

import java.util.Scanner;

public class notaCandidato {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.println("Informe sua primeira nota: ");
        n1 = leitor.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        n2 = leitor.nextDouble();
        
        System.out.println("Informe sua terceira nota: ");
        n3 = leitor.nextDouble();
       
       double media = ((n1 * 2) +  (n2 * 3) + (n3 * 5)) / 10 ;
       
       System.out.println("sua media ponderada final é de: " + media);
      
       if (media >= 7) {
           System.out.println("voce foi aprovado");
       }
       else {
           System.out.println("voce foi reprovado");
       }
       
       
       leitor.close();
    }
}