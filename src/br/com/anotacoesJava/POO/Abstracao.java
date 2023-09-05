//A abstração ajuda a lidar com a complexidade, tornando o código mais compreensível e gerenciável.

/*Exemplo de Abstração:

Vamos supor que você esteja criando um programa de gerenciamento de biblioteca. Você pode abstrair o conceito de um
livro, identificando atributos essenciais, como título, autor e ISBN, e comportamentos importantes, como empréstimo e
devolução.
Em seguida, você criaria uma classe Livro com esses atributos e métodos que representam esses comportamentos.
* */
package br.com.anotacoesJava.POO;

public class Abstracao {
    private String titulo;
    private String autor;
    private String isbn;

    public Abstracao(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void emprestar(){
        // Implementação do comportamento de empréstimo
    }
    public void devolver(){
        // Implementação do comportamento de devolução
    }
}
/*Benefícios da Abstração:

Simplificação: A abstração ajuda a simplificar a complexidade do mundo real, focalizando apenas os detalhes essenciais.
Reutilização: Classes abstratas podem ser reutilizadas em diferentes partes de um programa ou até mesmo em projetos diferentes.
Manutenção: É mais fácil manter e atualizar o código quando os detalhes irrelevantes são ocultados.
 */
