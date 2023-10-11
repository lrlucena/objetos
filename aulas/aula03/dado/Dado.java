public class Dado {
    private int lados;
    private int valor;

    public Dado() {
        this.lados = 6;
        lancar();  //this.valor = 1;
    }

    public Dado(int lados) {
        this.lados = lados;
        lancar();
    }

    public void lancar() {
        this.valor = (int)(Math.random() * this.lados + 1);
    }

    public int getValor() {
        return this.valor;
    }
}
