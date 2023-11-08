package provas.prova1;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Prof. Francisco Assis", "CNAT");
        Livro javaBasico = new Livro("Java Basico", "Deitel", 2019);
        Livro cppIniciantes = new Livro("C++ para Iniciantes", "Jorgiano Vidal", 2022);
        Livro sistemasFacil = new Livro("Sistemas Digitais simples e Facil", "Eduardo Braulio", 2022);
        
        biblioteca
          .adicionar(javaBasico)
          .adicionar(cppIniciantes);
        biblioteca.adicionar(sistemasFacil);

        long livros2022 = biblioteca.quantidadeLivros(122355788);
        System.out.println("Livros de 2022: " + livros2022);

    }
    
}
