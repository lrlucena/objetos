package aulas.aula07;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void listaNumeros(){
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 3, 7, 10, 20, 1, 4, 9, 31, 42, 47);
        Collections.sort(numeros);
        Collections.reverse(numeros);
        int posicao = Collections.binarySearch(numeros, 42);
        System.out.println(posicao);
        List<Integer> imodificavel = Collections.unmodifiableList(numeros);
        System.out.println(imodificavel.get(2));
        imodificavel.add(4);
    }
    
    public static void listaString() {
        List<String> nomes = new ArrayList<>();
        Collections.addAll(nomes, "Joao", "Maria", "Antonio");
        Collections.sort(nomes);
        Collections.reverse(nomes);
        int posicao = Collections.binarySearch(nomes, "Joao");
        System.out.println(posicao);
        List<String> imodificavel = Collections.unmodifiableList(nomes);
        System.out.println(imodificavel.get(2));
     //   imodificavel.add("Jose");
  
    }

    public static void listaPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa joao = new Pessoa("Joao", "j@com");
        Pessoa maria = new Pessoa("Maria", "m@com");
        Pessoa antonio = new Pessoa("Antonio", "a@com.br");
        Collections.addAll(pessoas, joao, maria, antonio);
        Collections.sort(pessoas);
        Collections.reverse(pessoas);
        int posicao = Collections.binarySearch(pessoas, joao);
        System.out.println(posicao);
        List<Pessoa> imodificavel = Collections.unmodifiableList(pessoas);
        System.out.println(imodificavel.get(2));
     //   imodificavel.add("Jose");
  
    }
    
    public static void main(String[] args) {
        listaPessoas();
    }
}
