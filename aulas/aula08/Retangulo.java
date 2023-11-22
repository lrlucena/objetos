package aulas.aula08;

public class Retangulo {
    private double base;
    private double altura;
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double b){
        this.base = b;
    }

    public double getBase(){
        return this.base;
    }

    public void setAltura(double h){
        this.altura = h;
    }

    public double getAltura(){
        return this.altura;
    }

    public double calcArea(){
        return (this.base * this.altura);
    }

    public double calcDiagonal(){
        return Math.sqrt((this.altura*this.altura)*(this.base*this.base));

    }

    @Override
    public String toString(){
        return "Base:" + this.base + " | Altura:" + this.altura;
    }
  
}
