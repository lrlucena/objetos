package aulas.aula10;

class Circulo extends Poligono implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
  
    public double relacaoAreaPerimetro() {
        return this.calcularArea() / this.calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}
