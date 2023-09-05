package br.com.anotacoesJava.POO;

public class Classes {
        //CLASSES
        /*Classes são um modelo ou plano para criar objetos. Ela define a estrutura
         e o comportamento dos objetos que serão criados a partir dela.
         Aqui está um exemplo simples de uma classe em Java: */

        //Atributos (ou campos) da classe
        String nome;
        int idade;

        //Método construtor para criar objetos de classe
        public Classes(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        //Método da classe
        public void saudacao(){
            System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos de idade");
        }
  }
