package aulas.aula04.poo.escolar;

public class Endereco {
  private String rua;
  private String cidade;
  private String cep;

  public String toString() {
    return this.rua + " - " + this.cidade + " - " + this.cep;
  }

  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
  public String getRua() {
    return rua;
  }
  public void setRua(String rua) {
    this.rua = rua;
  }
  public String getCEP() {
    return cep;
  }
  public void setCEP(String cep) {
    this.cep = cep;
  }
}
