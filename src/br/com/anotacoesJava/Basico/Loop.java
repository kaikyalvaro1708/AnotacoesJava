package br.com.anotacoesJava.Basico;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito?"); //Pergunta
        String filme = leitura.nextLine(); //input string
        /*System.out.println("Seu filme favorito é " + filme); //compilar*/

        System.out.println("Digite o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt(); //input inteiro

        System.out.println("Digite sua avaliação para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
