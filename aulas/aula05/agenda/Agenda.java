public class Agenda {
  private Compromisso[] compromissos;
  private int tamanho;
  private int quantidade;
  public Agenda(int tamanho) {
    this.tamanho = tamanho;
    this.compromissos = new Compromisso[this.tamanho];
    this.quantidade = 0; 
  }

  public Agenda() {
    this(100);
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  private void duplicarTamanho() {
        Compromisso[] comps = new Compromisso[this.tamanho * 2];
        for (int i; i< this.tamanho; i++) {
            comps[i] = compromissos[i];
        }
        this.compromissos = comps;
        this.tamanho *= 2;
  }

  public void inserir(Compromisso c) {
    if (this.quantidade >= this.tamanho) {
        duplicarTamanho();
    }
    this.compromissos[quantidade] = c;
    quantidade++;
  }
}
