/*Ele é um conceito importante em Java e outras linguagens de programação orientadas a objetos e envolve a restrição do
    acesso direto aos atributos de uma classe, fornecendo métodos públicos para acessá-los e modificá-los.
    O encapsulamento é essencial para garantir a integridade dos dados e a segurança em um programa.
    Aqui está uma explicação mais detalhada sobre o encapsulamento:
 */

package br.com.anotacoesJava.POO;

public class Encapsulamento {
    //ATRIBUTOS PRIVADOS
    /*Em Java, você pode declarar os atributos de uma classe como private, o que significa que eles só podem ser
    acessados diretamente dentro da própria classe. Isso evita que partes externas do código modifiquem ou acessem
    diretamente os dados da classe.*/

    private String nome;
    private int idade;

    //MÉTODOS DE ACESSO (GETTERS AND SETTERS)
     /*Para permitir o acesso controlado aos atributos privados, você pode fornecer métodos públicos chamados "getters"
      e "setters". Os getters permitem ler o valor de um atributo, enquanto os setters permitem modificar o valor.
      Os métodos podem incluir lógica adicional, como validação de dados.*/

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    /*Benefícios do Encapsulamento:

    Controle de Acesso: O encapsulamento permite que você defina quem pode acessar e modificar os dados de uma classe.
     Você pode restringir o acesso a partes específicas do código, garantindo que os dados sejam manipulados de maneira segura.

    Validação de Dados: Por meio dos setters, você pode adicionar lógica de validação para garantir que os dados
    estejam em um estado consistente e válido.

    Flexibilidade: Se você decidir fazer alterações internas na implementação da classe, como a forma como os dados
    são armazenados, pode fazê-lo sem afetar o código que usa a classe (desde que a interface pública permaneça a mesma).

    Segurança: Protege os dados da classe contra acesso não autorizado e garante que os valores dos atributos estejam
    sob controle.
     */
}
