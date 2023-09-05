import br.com.anotacoesJava.POO.Encapsulamento;

public class Main{
    public static void main(String[] args){
        //Obtendo o encapsulamento
        Encapsulamento pessoa = new Encapsulamento();
        pessoa.setNome("Kaiky");
        pessoa.setIdade(19);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}