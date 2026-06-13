    import java.util.Scanner;

    System.out.print("Digite o número de linhas (n): ");
    int n = leitor.nextInt();

    int numeroAtual = 1;

    // O primeiro laço (i) controla o número da linha atual
    for (int i = 1; i <= n; i++) {

        // O segundo laço (j) garante que a linha i tenha exatamente i números
        for (int j = 1; j <= i; j++) {
            System.out.print(numeroAtual);
            numeroAtual++; // Incrementa o número para o próximo passo
        }

        // Pula para a próxima linha após imprimir todos os números da linha atual
        System.out.println();
    }

