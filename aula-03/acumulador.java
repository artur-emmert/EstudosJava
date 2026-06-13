public class Main {
    public static void main(String[] args) {

        int numero = 0;
        int outroNumero = 5;
        numero = numero + 1; // contador 
        numero =  numero + outroNumero; // Acumulador

        // for ( VALOR INICIAL; CONDIÇÃO VERDADEIRA; ATUALIZAÇÃO VALOR )

        int acumulador = 0;

        for ( contador = 0; contador < 1000; contador = contador + 1 ) { 
            // System.out.print(contador + " ");
            acumulador = acumulador + contador;
        }

        System.out.println("A soma dos valores é: " + acumulador);



        // ---------------------------------
            
        Scanner leitor = new Scanner(System.in);
        int numeroDoUsuario = 0;
        int numeroSecreto =  5;
        int tentativas = 0; // contador

        // while ( CONDIÇÃO )

        while ( numeroDoUsuario != numeroSecreto) {
            System.out.println("Avinhe um número entre 0 e 10");
            numeroDoUsuario = leitor.nextInt();
            tentativas = tentativas + 1;
            
            if (numeroDoUsuario == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
            }
            else {
                System.out.println("voce errou! Tente novamente!");
            }
            
        System.out.println("Voce acertou em: " + tentativas + "tentativas");
        System.out.println("FIm de jogo");

        
        
        }
        
    }
}