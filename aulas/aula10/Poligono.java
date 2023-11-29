package aulas.aula10;

public abstract class Poligono implements Forma{
    public double relacaoAreaPerimetro() {
        return this.calcularArea() / this.calcularPerimetro();
    }
    public abstract String outroMetodo();
}
