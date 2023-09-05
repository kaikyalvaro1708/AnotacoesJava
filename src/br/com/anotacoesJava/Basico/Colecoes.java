/* --------------- Coleções Genéricas:
    As coleções em Java são estruturas de dados que podem armazenar um número variável de elementos de diferentes tipos.
     Diferentemente dos arrays, as coleções têm tamanho dinâmico e podem ser facilmente modificadas.
     As coleções mais comuns são parte do framework de coleções do Java e estão no pacote java.util.
 */

/* --------------- Principais Interfaces de Coleção:

List: Uma coleção ordenada que permite elementos duplicados. Exemplos de implementações são ArrayList e LinkedList.
Set: Uma coleção que não permite elementos duplicados. Exemplos de implementações são HashSet e TreeSet.
Map: Uma coleção de pares chave-valor, onde cada chave é única. Exemplos de implementações são HashMap e TreeMap.
*/

package br.com.anotacoesJava.Basico;
import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
        public static void main (String[] args){
            //Criando uma lista de strings
            List<String> nomes = new ArrayList<>();

            //Adicionando elementos à lista
            nomes.add("Alice");
            nomes.add("Carlos");
            nomes.add("Roberto");

            //Acessando os elementos da lista
            System.out.println("Nomes: " + nomes.get(1));

            //Iterando pelos elementos da lista
            for(String nome: nomes){
                System.out.println(nome);
            }

            //removendo elementos da lista
            nomes.remove("Carlos");
        }

        /* ------------------- HASHMAP
        //Criando um mapa de strings para as idades
        Map<String, Integer> idades = new HashMap<>();

        //Adicionan do pares chave-valor ao mapa
        idades.put("Alice", 35);
        idades.put("Carlos", 18);
        idades.put("Roberto", 22);

        // Acessando valores no mapa
        int idadeAlice = idades.get("Alice"); // 25

        // Iterando pelos pares chave-valor no mapa
            for (Map.Entry<String, Integer> entrada : idades.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos.");
        }

        // Removendo um par chave-valor do mapa
            idades.remove("Bob");
         */
}
