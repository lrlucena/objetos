package aulas.aula07;

public class Pessoa implements Comparable<Pessoa> {
  private String nome;
  private String email;
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Pessoa(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }
@Override
public int compareTo(Pessoa o) {
  return this.nome.compareTo(o.nome);
}
@Override
public String toString() {
  return "Pessoa [nome=" + nome + "]";
}
}
