public class Dado {
    private int lados = 6;
    private int _valor = 1;

    public void lancar() {
        _valor = (int)(Math.random() * lados + 1);
    }

    public int valor() {
        return _valor;
    }
}
