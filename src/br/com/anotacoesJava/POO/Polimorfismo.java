/*Ele se refere à capacidade de objetos de diferentes classes responderem de maneira semelhante a chamadas de métodos
com o mesmo nome. Isso permite que você escreva código mais genérico e flexível, trabalhando com objetos de diferentes
 classes de maneira uniforme.

Existem duas formas principais de polimorfismo em Java: polimorfismo de subtipos e polimorfismo paramétrico.
*/

package br.com.anotacoesJava.POO;


//----------------------------------- POLIMORFISMO DE SUBTIPOS (OU DE HERANÇA)
    /*O polimorfismo de subtipos é alcançado através da sobrescrita de métodos nas subclasses. Isso significa que a
     mesma chamada de método pode ter comportamentos diferentes em diferentes subclasses.
     */

class Animal{
    void fazerSom(){
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal{
    @Override
    void fazerSom(){
        System.out.println("O cachorro late.");
    }
}

class Gato extends Animal{
    @Override
    void fazerSom(){
        System.out.println("O gato mia.");
    }
}

//----------------------------------- POLIMORFISMO PARAMÉTICO (OU GENERICS)
    /*Ele permite que você crie classes ou métodos que funcionem com diferentes tipos de dados sem especificar o tipo
     de dados em tempo de compilação.
    Isso aumenta a reutilização do código e a segurança de tipo.
     */

class Caixa<T>{
    private T conteudo;

    public Caixa(T conteudo){
        this.conteudo = conteudo;
    }
    public T getConteudo(){
        return conteudo;
    }
}
public class Polimorfismo {

    //POLIMORFISMO DE HERANÇA
    public static void main(String[] agrs){
        Animal animal01 = new Cachorro();
        Animal animal02 = new Gato();

        animal01.fazerSom();
        animal02.fazerSom();
    }

    //POLIMORFISMO GENERICS

    /*Caixa<String> caixa1 = new Caixa<>("Olá, mundo!");
    Caixa<Integer> caixa2 = new Caixa<>(42);

    String conteudo1 = caixa1.getConteudo();
    int conteudo2 = caixa2.getConteudo();

        System.out.println(conteudo1); // Produz: Olá, mundo!
        System.out.println(conteudo2); // Produz: 42
       */

    /*Neste exemplo, a classe Caixa é genérica e pode conter valores de diferentes tipos. Isso é alcançado usando <T>
    como um tipo genérico. O polimorfismo paramétrico permite que você use a mesma classe genérica com tipos diferentes.
     */


}
