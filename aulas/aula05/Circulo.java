package aulas.aula05;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
        this.raio = 1;
    }

    public double area(){
        return Math.PI * Math.pow(this.raio, 2.0);
    }

    public double circunferencia(){
        return 2 * Math.PI * this.raio;
    }
    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        }
    }
}
