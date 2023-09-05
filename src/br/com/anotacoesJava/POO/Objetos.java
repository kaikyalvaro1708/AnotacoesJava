/*Um objeto é uma instância de uma classe. Você pode criar objetos a partir de
de uma classe usando o operador 'new'. Aqui está como criar e usar objetos da classe 'Pessoa'.
 */

package br.com.anotacoesJava.POO;

public class Objetos {
    public static void main(String[] agrs){
        //Criar objetos da classe da Pessoa
        Classes pessoa01 = new Classes("Alice", 18);
        Classes pessoa02 = new Classes("Bob", 20);

        //Chamar métodos nos objetos
        pessoa01.saudacao();
        pessoa02.saudacao();
    }
}
