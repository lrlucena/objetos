package aulas.aula08;

public class Main {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(10,20);
        Retangulo quad = new Quadrado(10);

        System.out.println(ret.calcArea());
        System.out.println(((Quadrado)quad).calcArea());

        quad.setAltura(30);

        System.out.println(quad.calcArea());
        System.out.println(quad.calcDiagonal());
    }
    
}
