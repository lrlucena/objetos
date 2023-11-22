package aulas.aula08;

public class Frete {
    private double distancia;
    private double peso;
    private double frete;
    public Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    public double getFrete(){
        this.frete = this.distancia * this.peso * 0.01;
        return this.frete;
    }



    
}
