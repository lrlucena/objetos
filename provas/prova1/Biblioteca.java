package provas.prova1;

import java.util.Arrays;

public class Biblioteca {
    private String nome;
    private String endereco;
    private Livro[] livros;
    private int quantidade;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new Livro[10];
        this.quantidade = 0;
    }

    private void aumentarLivros() {
        this.livros = Arrays.copyOf(livros, livros.length * 2);
    }

    public Biblioteca adicionar(Livro livro) {
        if (this.quantidade >= livros.length) {
            aumentarLivros();
        }
        livros[quantidade] = livro;
        quantidade++;
        return this;
    }

    public Biblioteca remover(Livro livro) {
        for (int i = 0; i < this.quantidade; i++) {
            if (livros[i] == livro) {
                livros[i] = livros[this.quantidade - 1];
                this.quantidade--;
            }
        }
        return this;
    }

    public Livro[] listarLivros() {
        // Arrays.copyOf(livros, this.quantidade);
        return livros;
    }
    public int quantidadeLivros() {
        return this.quantidade;
    }
    public int quantidadeLivros(int ano) {
        int cont = 0;
        for(int i = 0; i < this.quantidade; i++) {
            Livro livro = livros[i];
            if (livro.getAno() == ano) {
                cont++;
            }
        }
        return cont;
    }
    
    public String[] autores() {
        String[] resposta = new String[this.quantidade];
        for(int i = 0; i < this.quantidade; i++) {
            resposta[i] = livros[i].getAutor();
        }
        Arrays.sort(livros);
        return resposta;
    }
}
