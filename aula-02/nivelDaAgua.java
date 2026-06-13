import java.util.Scanner;

public class nivelDaAgua {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        double nivel = 0; // inicialização de variável

        System.out.print("Informe o nivel atual: "); 
        nivel = leitor.nextDouble();

        if ( nivel >= 4)
        {
            System.out.println("Cota de inundação atingida");
        }
        else
        {
            if ( nivel < 2)  // if aninhado
            {
                System.out.println("Cota de seca atingida!");
            }
            else
            {
                System.out.println("Nível aceitável");
            }
        }

        leitor.close();

    }
}