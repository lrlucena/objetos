package aulas.aula08;

public class FreteExpresso extends Frete{
    private double valorSegurado;
    public FreteExpresso(double distancia, double peso, double valorSegurado){
        super(distancia, peso);
        this.valorSegurado = valorSegurado;
    }

    @Override
    public double getFrete(){
        return (super.getFrete() * 2)  + (this.valorSegurado * 0.01);
    }
}
