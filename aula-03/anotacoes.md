Aula 3 - Repetição ou Interação

Em Java, os laços de repetição (ou loops) são estruturas essenciais usadas para executar um bloco de código repetidamente até que uma condição específica seja satisfeita. Os três principais tipos são for, while e do-while, otimizando o código e evitando repetições manuais.1. ForO laço for é ideal quando você sabe exatamente quantas vezes o bloco deve ser repetido.
Ele reúne a inicialização, a condição e a atualização em uma única linha.javafor 

(int i = 0; i < 5; i++) {
    System.out.println("O valor de i é: " + i);
}

Existe também uma variação chamada for-each, simplificada para percorrer arrays e coleções sem precisar controlar índices:javaString[] frutas = {"Maçã", "Banana", "Uva"};
for (String fruta : frutas) {
    System.out.println(fruta);
}

2. WhileO laço while é utilizado quando o número de repetições não é conhecido de antemão. Ele avalia a condição antes de executar o bloco, podendo até não executar caso a condição seja falsa logo de 

início.javaint c

ontador = 0;

while (contador < 3) {
    System.out.println("Contagem: " + contador);
    contador++;
}


3. Do-WhileSemelhante ao while, o do-while testa a condição no final da estrutura. Isso garante que o bloco de código seja executado pelo menos uma vez, independentemente da condição.javaint numero = 1;
do
 {
    System.out.println("Executando pelo menos uma vez, número: " + numero);
    numero++;
} while (numero <= 2);

Controle de LaçosVocê pode alterar o comportamento padrão de um laço utilizando dois comandos:break: Interrompe completamente o laço.continue: Pula a repetição atual e avança para a próxima iteração.Para acompanhar a resolução detalhada de exercícios utilizando laços de repetição e visualizar a execução em tempo real: