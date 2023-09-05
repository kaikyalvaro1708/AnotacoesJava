//DEFINIÇÕES:
/*
Uma interface em Java é uma coleção de métodos abstratos (métodos sem implementação) e, opcionalmente, constantes
(variáveis finais) que podem ser implementadas por classes concretas.

As interfaces são usadas para definir contratos que as classes devem cumprir, especificando quais métodos elas devem fornecer.

Os métodos dentro de uma interface são implicitamente public e abstract, ou seja, eles não têm implementações e
são públicos por padrão.
* */

package br.com.anotacoesJava.POO;

public class Interfaces {
    interface Animal{
        void fazerSom();
    }
    interface AnimalDomestico{
        void serAmigavel();
    }

    class Cachorro implements Animal{
        @Override
        public void fazerSom(){
            System.out.println("O cachorro late.");
        }
    }

    /*Múltiplas Interfaces:

    Em Java, uma classe pode implementar várias interfaces separadas por vírgula.
    Isso permite que uma classe cumpra múltiplos contratos de interface.*/

    class Gato implements Animal, AnimalDomestico{
        @Override
        public void fazerSom(){
            System.out.println("O gato mia.");
        }

        public void serAmigavel(){
            System.out.println("O gato é amigável");
        }
    }
}
