Aula 2 - If e Else (Se for → Se não…)

A estrutura if / else em Java é o principal comando de controle de fluxo. Ele avalia uma condição booleana: se for verdadeira (true), executa o bloco if; se for falsa (false), desvia a execução para o bloco alternativo else

if (condição) {
    // Código executado se a condição for verdadeira
} else {
    // Código executado se a condição for falsa
}

Exemplo PráticoPodemos verificar a nota de um aluno para determinar se ele foi aprovado ou reprovado:

double nota = 7.5;

if (nota >= 6.0) {
    System.out.println("Aluno aprovado!");
} else {
    System.out.println("Aluno reprovado.");
}

