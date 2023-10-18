package aulas.aula04.poo.escolar;
public class Pessoa {
  private class TurmaPrivada {
    
  }
  private String nome;
  private int anoNasc;
  private Endereco endereco;  // Relacionamento entre Pessoa e Endereco
  private TurmaPrivada turma;
  public Pessoa(String nome) {
    this.nome = nome;
    this.anoNasc = 2003;
    this.endereco = new Endereco();
  }
  public String getNome() {
    return this.nome;
  }
  public int getIdade(){
    return 2023 - this.anoNasc;
  }
  public void setIdade(int idade) {
    this.anoNasc = 2023 - idade;
  }
  public Endereco getEndereco(){
    return this.endereco;
  }
}


