import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

    double peso;
    double altura;
    double IMC;

    System.out.println("Qual é a sua altura em metros? ");
    altura = leitor.nextDouble();

    System.out.println("Qual é a seu peso em kg?" );
    peso = leitor.nextDouble();

    IMC = peso / (altura * altura);

	System.out.println("O seu IMC é: " + IMC);

	leitor.close();

}
    
}

