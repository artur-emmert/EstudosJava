import java.util.Scanner;

public class maiorvalor {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Informe o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Informe o segundo número: ");
        n2 = leitor.nextInt();
        
        if (n1 > n2) {
            System.out.println("O primeiro numero é maior que o segundo");
        } 
        else if (n1 < n2) { 
            System.out.println("O primeiro numero é menor que o segundo");
        } 
        else { 
            System.out.println("São valores iguais");
        }
        
        leitor.close();
    }
}