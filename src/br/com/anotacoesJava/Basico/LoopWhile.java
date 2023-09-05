package br.com.anotacoesJava.Basico;
import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while (nota != -1){
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if(nota != -1) {
                mediaAvalicao += nota;//recebe oq já tinha + nota
                totalDeNotas++;
            }
        }
        System.out.println("Média de avaliação: " + mediaAvalicao/totalDeNotas);


        //EXERCICIOS
        int contador = 1;

        while(contador <= 10){
            System.out.println(contador);
            contador++;
        }
    }
}
