public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        int a = dado1.valor();
        System.out.println(a);
        dado1.lancar();
        a = dado1.valor();
        System.out.println(a);
    }
}

/*
dado1 = Dado(6)
a = dado1.valor
escreva a
dado1.lançar
b = dado1.valor
escreva b
dado2 = Dado(6)
dado2.lançar
c = dado2.valor
escreva c
 */