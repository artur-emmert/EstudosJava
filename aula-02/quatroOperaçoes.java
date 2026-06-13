import java.util.Scanner;

public class quatroOperaçoes {
    public static void main(String[] args) throws Exception {

    Scanner leitor = new Scanner(System.in);
    double numero1, numero2;

    System.out.println("Infome o primeiro número: ");
    numero1 = leitor.nextDouble();

    System.out.println("Infome o segundo número: ");
    numero2 = leitor.nextDouble();

    double soma, subtração, produto, divisao;
    soma = numero1 + numero2;
    subtração = numero1 - numero2;
    produto = numero1 * numero2;
    
    System.out.println("O resultado da soma é: " + soma + "O resultado da subtração é: " + subtração  + "O resultado dp produto é: " + produto );
    
    if ( numero2 != 0 ) 
        {
        divisao = numero1 / numero2;
        System.out.println("O resultado da divisão é: " + divisao );
    }
    else 
    {
        System.out.println("Erro, sem divisão por zero");
    }


    leitor.close();
    
    }
}