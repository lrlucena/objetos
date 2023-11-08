package provas.prova1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livros;
    private int quantidade;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
        this.quantidade = 0;
    }

    public Biblioteca adicionar(Livro livro) {
        this.livros.add(livro);
        return this;
    }

    public Biblioteca remover(Livro livro) {
        this.livros.remove(livro);
        return this;
    }

    public  List<Livro> listarLivros() {
        // Arrays.copyOf(livros, this.quantidade);
        return Collections.unmodifiableList(this.livros);
    }
    public int quantidadeLivros() {
        return this.livros.size();
    }
    public long quantidadeLivros(int ano) {
        long cont = 0;
        cont = livros.stream().filter(livro -> ano == livro.getAno()).count();

        // for(int i = 0; i < this.livros.size(); i++) {
        //     Livro livro = livros.get(i);
        //     if (livro.getAno() == ano) {
        //         cont++;
        //     }
        // }
        return cont;
    }
    
    public List<String> autores() {
        List<String> resposta = new String[livros.size()];
        
        // for(int i = 0; i < this.quantidade; i++) {
        //     resposta[i] = livros[i].getAutor();
        // }
        // Arrays.sort(livros);
        return resposta;
    }
}
